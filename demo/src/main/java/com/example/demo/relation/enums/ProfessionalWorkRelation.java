package com.example.demo.relation.enums;

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
	public Relation getParent() {
        return ProfessionalSubCategory.WORK;
    }

}
