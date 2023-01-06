package com.example.demo.common.validation;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.common.enums.RelationDTO;

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

	public void validateInputWithInjectedValidator(RelationDTO relation) {
	    Set<ConstraintViolation<RelationDTO>> violations = validator.validate(relation);
	    if (!violations.isEmpty()) {
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