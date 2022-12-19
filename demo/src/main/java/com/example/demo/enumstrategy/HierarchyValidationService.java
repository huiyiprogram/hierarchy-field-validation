package com.example.demo.enumstrategy;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@Service
public
class HierarchyValidationService {

  private Validator validator;

  HierarchyValidationService(Validator validator) {
    this.validator = validator;
  }
  
  private static String toString(Set<? extends ConstraintViolation<?>> constraintViolations) {
		return constraintViolations.stream()
			.map( cv -> cv == null ? "null" : cv.getPropertyPath() + ": " + cv.getMessage() )
			.collect( Collectors.joining( ", " ) );
	}

  public void validateInputWithInjectedValidator(RelationClass relation) {
    Set<ConstraintViolation<RelationClass>> violations = validator.validate(relation);
    if (!violations.isEmpty()) {
    	System.out.println("VIOLATIONS " + toString(violations));
      throw new ConstraintViolationException(violations);
    }
  }
  
  void validateInput(String string) {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();
	    Set<ConstraintViolation<String>> violations = validator.validate(string);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }
}