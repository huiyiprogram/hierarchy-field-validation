package com.example.demo.relation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;

@Constraint(validatedBy = HierarchyValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface HierarchyValidation {
	String message() default "Invalid Hierarchy!";

    String category();

    String subCategory();
    
    String child();
    
    String enumBase();
    
    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
    	HierarchyValidation[] value();
    }
}
