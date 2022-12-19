package com.example.demo.relation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.enumstrategy.RelationClass;

import jakarta.validation.Valid;

@Controller
public class RelationController {
	
    @PostMapping("/user")
    public boolean createRelationClass(String category, String subCategory, String relationValue) {
    	@Valid 
    	RelationClass relation = new RelationClass(category, subCategory, relationValue);
        return relation != null;
    }
}