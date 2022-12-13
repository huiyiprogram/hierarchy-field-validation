package com.example.demo.relation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.BeanWrapperImpl;

import com.example.demo.relation.enums.IEnumBase;
import com.example.demo.relation.enums.RelationMap;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HierarchyValidator implements ConstraintValidator<HierarchyValidation, Object> {

    private String category;
    private String subCategory;
    private String child;
    private String enumBase;

    public void initialize(HierarchyValidation constraintAnnotation) {
        this.category = constraintAnnotation.category();
        this.subCategory = constraintAnnotation.subCategory();
        this.child = constraintAnnotation.child();
        this.enumBase = constraintAnnotation.enumBase();
    }

    public boolean isValid(Object value, ConstraintValidatorContext context) {

        Object categoryValue = new BeanWrapperImpl(value)
        		.getPropertyValue(category);
        Object subCategoryValue = new BeanWrapperImpl(value)
        		.getPropertyValue(subCategory);
        Object childValue = new BeanWrapperImpl(value)
        		.getPropertyValue(child);
        Object enumBaseValue = new BeanWrapperImpl(value)
        		.getPropertyValue(enumBase);
       
        IEnumBase[] enumBaseList = null;
        switch(enumBaseValue.toString()) {
        	case "RelationMap":
        		enumBaseList = RelationMap.values();
        	
        }
        
        Optional<IEnumBase> filteredEnumBaseMap = null;
        filteredEnumBaseMap = Stream.of(List.of(enumBaseList))
	        .flatMap(List::stream)
	        .filter(child -> child.getCategory().equals(categoryValue.toString()) &&
	        					child.getSubCategory().equals(subCategoryValue.toString()) &&
    							child.getChild().equals(childValue.toString()))
	        .findFirst();
        
        return filteredEnumBaseMap.isPresent();
    }
}
