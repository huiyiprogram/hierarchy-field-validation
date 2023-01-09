package com.example.demo.common.validation;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.common.enums.RelationDTO;
import com.example.demo.common.enums.RelationRequest;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

@Service
public
class RelationService {
	private Validator validator;
	
	RelationService(Validator validator) {
		this.validator = validator;
	}

	public void validateHierarchy(RelationRequest relationRequest) {
	    Set<ConstraintViolation<RelationRequest>> violations = validator.validate(relationRequest);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	}
	
	public RelationDTO convertRequestToDTO(RelationRequest request) {
		RelationDTO dto = new RelationDTO();
		dto.setCategory(request.getCategory());
		dto.setSubCategory(request.getSubCategory());
		dto.setFinalRelation(request.getFinalRelation());
		
		return dto;
	}
  
}