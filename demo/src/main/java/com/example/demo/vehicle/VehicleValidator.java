package com.example.demo.vehicle;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class VehicleValidator implements ConstraintValidator<VehicleConstraint, String > {

	  @Override
	  public boolean isValid(String value, ConstraintValidatorContext context) {
		  if(value == null) {
			  return false;
		  }
		  return true;
	}
}
