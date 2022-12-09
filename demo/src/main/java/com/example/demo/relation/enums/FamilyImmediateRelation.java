package com.example.demo.relation.enums;

import com.example.demo.relation.Relation;

public enum FamilyImmediateRelation implements Relation {
	
    PARENT("Parent"),
    CHILD("Child"),
    SPOUSE("Spouse"),
    SIBLING("Sibling");
	
	private String value;
	
	FamilyImmediateRelation(String value) {
		this.value = value;
	}
	
	@Override
	public Relation getParent() {
        return FamilySubCategory.IMMEDIATE;
    }

    public String getValue() {
		return this.value;
	}

}
