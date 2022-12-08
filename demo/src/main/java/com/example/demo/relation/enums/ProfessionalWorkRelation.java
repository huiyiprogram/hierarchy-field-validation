package com.example.demo.relation.enums;

import java.util.Optional;

import com.example.demo.relation.Relation;

public enum ProfessionalWorkRelation implements Relation {
	
    SUPERIOR("Superior"),
    SUBORDINATE("Subordinate");
	
	private String value;
	
	ProfessionalWorkRelation(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	@Override
	public String getParent() {
        return ProfessionalSubCategory.WORK.getValue();
    }

	@Override
	public Optional<Relation> getEnum(String value) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
