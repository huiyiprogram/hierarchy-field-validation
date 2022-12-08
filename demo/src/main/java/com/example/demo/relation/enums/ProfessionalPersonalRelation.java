package com.example.demo.relation.enums;

import java.util.Optional;

import com.example.demo.relation.Relation;

public enum ProfessionalPersonalRelation implements Relation {
	
    DRIVER("Driver"),
    BODYGUARD("Body Guard");
	
	private String value;
	
	ProfessionalPersonalRelation(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	@Override
	public String getParent() {
        return ProfessionalSubCategory.PERSONAL.getValue();
    }

	@Override
	public Optional<Relation> getEnum(String value) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
