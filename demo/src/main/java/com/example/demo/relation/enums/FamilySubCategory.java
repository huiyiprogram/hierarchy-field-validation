package com.example.demo.relation.enums;

import java.util.Optional;

import com.example.demo.relation.Relation;

public enum FamilySubCategory implements Relation {

    IMMEDIATE("Immediate"),
    EXTENDED("Extended");

    private String value;

    FamilySubCategory(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getParent() {
        return RelationCategory.FAMILY.getValue();
    }

	@Override
	public Optional<Relation> getEnum(String value) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
    
}