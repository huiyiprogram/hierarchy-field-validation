package com.example.demo.relation.enums;

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
	public Relation getParent() {
        return ProfessionalSubCategory.PERSONAL;
    }

}
