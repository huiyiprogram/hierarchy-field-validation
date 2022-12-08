package com.example.demo.vehicle;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = VehicleValidator.class)
@Target({ ElementType.CONSTRUCTOR }) // Not confirm which one to target yet
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface VehicleConstraint {
	String message() default "Must be a valid Vehicle";
	
	Class<?>[] groups() default { };
	
	Class<? extends Payload>[] payload() default {};
}
