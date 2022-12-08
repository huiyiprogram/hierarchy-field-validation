package com.example.demo.relation.enums;

import java.util.Optional;

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

	public String getParent() {
        return RelationCategory.PROFESSIONAL.getValue();
    }

	@Override
	public Optional<Relation> getEnum(String value) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}