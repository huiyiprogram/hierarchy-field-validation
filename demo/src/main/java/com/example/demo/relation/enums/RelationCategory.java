package com.example.demo.relation.enums;

import com.example.demo.relation.Relation;

public enum RelationCategory implements Relation {
	
    FAMILY("Family"),
    PROFESSIONAL("Professional");
    
    private String value;
	
    RelationCategory(String value) {
        this.value = value;
    }
    
	public String getValue() {
		return this.value;
	}

	@Override
	public Relation getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
