package com.example.demo.relation.enums;

import java.util.Optional;

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
	public String getParent() {
        return FamilySubCategory.IMMEDIATE.getValue();
    }

    public String getValue() {
		return this.value;
	}

	@Override
	public Optional<Relation> getEnum(String value) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
