package com.example.demo.relation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.common.enums.RelationDTO;

import jakarta.validation.Valid;

@Controller
public class RelationController {
	
    @PostMapping("/user")
    public boolean createRelationClass(String category, String subCategory, String relationValue) {
    	@Valid 
    	RelationDTO relation = new RelationDTO(category, subCategory, relationValue);
        return relation != null;
    }
}