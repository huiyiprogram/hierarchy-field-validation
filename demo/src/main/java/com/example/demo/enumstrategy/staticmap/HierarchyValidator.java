package com.example.demo.enumstrategy.staticmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.BeanWrapperImpl;

import com.example.demo.common.enums.IEnumBase;
import com.example.demo.common.enums.IEnumBase.HierarchyTier;
import com.example.demo.common.enums.IEnumBase.HierarchyValidationStrategy;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HierarchyValidator implements ConstraintValidator<HierarchyValidation, Object> {

    private String category;
    private String subCategory;
    private String child;
    private Class<?> enumBase;
    private HierarchyValidationStrategy strategy;

    // Get property names of annotation
    public void initialize(HierarchyValidation constraintAnnotation) {
        this.category = constraintAnnotation.category();
        this.subCategory = constraintAnnotation.subCategory();
        this.child = constraintAnnotation.child();
        this.enumBase = constraintAnnotation.enumBase();
        this.strategy = constraintAnnotation.strategy();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
    	switch(strategy) {
    	case ENUM_STRATEGY_STATICMAP:
    		return enumStrategyAndStaticMap(value);
    	default:
    		break;
    	}
    	
    	return false;
    }
    
    private boolean enumStrategyAndStaticMap(Object value) {
    	BeanWrapperImpl annotationObject = new BeanWrapperImpl(value);
        Object categoryValue = annotationObject.getPropertyValue(category);
        Object subCategoryValue = annotationObject.getPropertyValue(subCategory);
        Object childValue = annotationObject.getPropertyValue(child);
        
        if(Objects.isNull(categoryValue) || Objects.isNull(subCategoryValue) || Objects.isNull(childValue)) {
        	return false;
        }
       
    	List<IEnumBase> enumBaseList = new ArrayList<IEnumBase>();
        switch(enumBase.getSimpleName()) {
        	case "RelationMap":
        		enumBaseList = List.of(RelationMap.values());
        		break;
        	default:
        		break;        	
        }
        
        Optional<IEnumBase> filteredEnumBaseMap = null;
        filteredEnumBaseMap = Stream.of(enumBaseList)
	        .flatMap(List::stream)
	        .filter(enumVar -> enumVar.getCategory().equals(enumVar.getEnumByValue(HierarchyTier.CATEGORY, categoryValue.toString())) && 
	        				   enumVar.getSubCategory().equals(enumVar.getEnumByValue(HierarchyTier.SUBCATEGORY, subCategoryValue.toString())) && 
	        				   enumVar.getChild().equals(enumVar.getEnumByValue(HierarchyTier.CHILD, childValue.toString())))
	        .findFirst();
        
        return filteredEnumBaseMap.isPresent();
    }
    
}
