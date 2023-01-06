package com.example.demo.common.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.enums.RelationDTO;
import com.example.demo.common.enums.RelationRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/relation")
public class RelationController {
	
	@Autowired
	private RelationService service;
	
	@PostMapping
	public ResponseEntity<RelationDTO> create(@RequestBody RelationRequest relationRequest) {
		// Check if request is null
		if(relationRequest != null) {
			service.validateHierarchy(relationRequest);
		}
		return null;
		
	}
}
