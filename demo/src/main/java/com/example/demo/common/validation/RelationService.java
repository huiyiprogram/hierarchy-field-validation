package com.example.demo.common.validation;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.common.enums.RelationHierarchy;
import com.example.demo.common.enums.RelationRequest;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

@Service
public
class RelationService {
	private Validator validator;
	
	private RelationHierarchyRepository repo;

	RelationService(Validator validator) {
		this.validator = validator;
	}

	public void validateHierarchy(RelationRequest relationRequest) {
	    Set<ConstraintViolation<RelationRequest>> violations = validator.validate(relationRequest);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	}
  
}