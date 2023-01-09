package com.example.demo.common.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.enums.RelationDTO;
import com.example.demo.common.enums.RelationRequest;

import jakarta.validation.ConstraintViolationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/relation")
@Validated
public class RelationController {
	
	@Autowired
	private RelationService service;
	
	@PostMapping
	public ResponseEntity<Object> create(@RequestBody RelationRequest relationRequest) {
		
		// Check if request is null
		if(relationRequest != null) {
			try {
				service.validateHierarchy(relationRequest);
			} catch (ConstraintViolationException e) {
				ResponseEntity<Object> response = new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
				return response;
			}
		}
		
		// Mapping request to DTO
		RelationDTO dto = service.convertRequestToDTO(relationRequest);
		return ResponseEntity.ok(dto);
	}
}
