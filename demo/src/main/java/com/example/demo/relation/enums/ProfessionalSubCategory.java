package com.example.demo.relation.enums;

import com.example.demo.relation.Relation;

public enum ProfessionalSubCategory implements Relation {
	
    WORK("Work"),
    PERSONAL("Personal");

	private String value;
	
    ProfessionalSubCategory(String value) {
		this.value = value;
	}
    
    public String getValue() {
		return this.value;
	}

	public Relation getParent() {
        return RelationCategory.PROFESSIONAL;
    }

}