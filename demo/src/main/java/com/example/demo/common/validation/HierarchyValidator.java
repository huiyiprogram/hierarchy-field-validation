package com.example.demo.common.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.common.enums.IHierarchyEnumBase;
import com.example.demo.common.enums.IHierarchyEnumBase.HierarchyTier;
import com.example.demo.common.enums.IHierarchyEnumBase.HierarchyValidationStrategy;
import com.example.demo.common.enums.RelationHierarchy;
import com.example.demo.enumadvanced.IEnumBaseAdvanced;
import com.example.demo.enumadvanced.RelationChildAdvanced;
import com.example.demo.enumpolymorphism.RelationInterface;
import com.example.demo.enumstrategy_staticmap.RelationMap;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HierarchyValidator implements ConstraintValidator<HierarchyValidation, Object> {

    private String category;
    private String subCategory;
    private String child;
    private Class<?> validationEnum;
    private HierarchyValidationStrategy strategy;
    
    private String categoryStr;
    private String subCategoryStr;
    private String childStr;
    
    @Autowired
	RelationHierarchyRepository relationHierarchyRepository;

    // Get property names of annotation
    public void initialize(HierarchyValidation constraintAnnotation) {
        this.category = constraintAnnotation.category();
        this.subCategory = constraintAnnotation.subCategory();
        this.child = constraintAnnotation.child();
        this.validationEnum = constraintAnnotation.validationEnum();
        this.strategy = constraintAnnotation.strategy();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
    	BeanWrapperImpl annotationObject = new BeanWrapperImpl(value);
        Object categoryValue = annotationObject.getPropertyValue(category);
        Object subCategoryValue = annotationObject.getPropertyValue(subCategory);
        Object childValue = annotationObject.getPropertyValue(child);
    	
        // Check if any values are null
        if(Objects.isNull(categoryValue) || Objects.isNull(subCategoryValue) || Objects.isNull(childValue)) {
        	return false;
        }
        
        this.categoryStr = categoryValue.toString();
        this.subCategoryStr = subCategoryValue.toString();
        this.childStr = childValue.toString();
        
    	switch(strategy) {
    	case ENUM_STRATEGY_STATICMAP:
    		return enumStrategyAndStaticMap();
    	case ENUM_POLYMORPHISM:
    		return enumPolymorphism();
    	case ENUM_STRATEGY_PATTERN:
    		return enumStrategyPattern();
    	case TREE_STRUCTURE_PARENT_REF:
    		return treeStructureParentRef();
    	default:
    		break;
    	}
    	
    	return false;
    }
    
    private boolean enumStrategyPattern() {
    	
    	List<IEnumBaseAdvanced> enumBaseList = new ArrayList<IEnumBaseAdvanced>();
        switch(validationEnum.getSimpleName()) {
        	case "ChildAdvanced":
        		enumBaseList = List.of(RelationChildAdvanced.values());
        		break;
        	default:
        		break;        	
        }
        
         Optional<IEnumBaseAdvanced> childEnum = Stream.of(enumBaseList)
	        .flatMap(List::stream)
	        .filter(enumVar -> enumVar.getValue() == childStr)
	        .findFirst();
         
         if(childEnum.isPresent() && 
        		 childEnum.get().getCategory().equals(categoryStr) &&
        		 childEnum.get().getSubCategory().equals(subCategoryStr)) {
        	 return true;
         }
        
		return false;
    }
    
    private boolean enumStrategyAndStaticMap() {
    	
    	List<IHierarchyEnumBase> enumBaseList = new ArrayList<IHierarchyEnumBase>();
        switch(validationEnum.getSimpleName()) {
        	case "RelationMap":
        		enumBaseList = List.of(RelationMap.values());
        		break;
        	default:
        		break;        	
        }
        
        Optional<IHierarchyEnumBase> filteredEnumBaseMap = null;
        filteredEnumBaseMap = Stream.of(enumBaseList)
	        .flatMap(List::stream)
	        .filter(enumVar -> enumVar.getCategory().equals(enumVar.getEnumByValue(HierarchyTier.CATEGORY, categoryStr)) && 
	        				   enumVar.getSubCategory().equals(enumVar.getEnumByValue(HierarchyTier.SUBCATEGORY, subCategoryStr)) && 
	        				   enumVar.getChild().equals(enumVar.getEnumByValue(HierarchyTier.CHILD, childStr)))
	        .findFirst();
        
        return filteredEnumBaseMap.isPresent();
    }
    
    private boolean enumPolymorphism() {
    	Optional<RelationInterface> category = RelationInterface.fromCategoryValue(categoryStr);
    	Optional<RelationInterface> subCategory = RelationInterface.fromCategoryValue(subCategoryStr);
    	Optional<RelationInterface> child = RelationInterface.fromCategoryValue(childStr);
    	
    	if(!category.isPresent() || !subCategory.isPresent() || !child.isPresent()) {
    		return false;
    	}
    	
    	// Compare parents if they are equivalent to the inputs
    	if(child.get().getCategory().equals(category.get()) &&
    	   child.get().getSubCategory().equals(subCategory.get())) {
    		return true;
    	}
    	
    	return false;
    }
    
    private boolean treeStructureParentRef() {
    	Optional<RelationHierarchy> relationHierarchy = relationHierarchyRepository.findById(childStr);
    	System.out.println("RELATION HIERARCHY: " + relationHierarchy);
    	return false;
    }
    
}
