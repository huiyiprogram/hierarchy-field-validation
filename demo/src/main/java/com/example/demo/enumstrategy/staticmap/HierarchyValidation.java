package com.example.demo.enumstrategy.staticmap;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.demo.common.enums.IEnumBase.HierarchyValidationStrategy;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = HierarchyValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface HierarchyValidation {
	String message() default "Invalid Hierarchy!";

    String category();

    String subCategory();
    
    String child();
    
    Class<?> enumBase();
    
    HierarchyValidationStrategy strategy();
    
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
    
    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
    	HierarchyValidation[] value();
    }
}
