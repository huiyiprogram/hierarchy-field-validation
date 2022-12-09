package com.example.demo.relation.enums;

import com.example.demo.relation.Relation;

public enum FamilyExtendedRelation implements Relation {
	
    GRANDPARENT("Grandparent"),
    COUSIN("Cousin"),
    UNCLE("Uncle");
	
	private String value;
	
	FamilyExtendedRelation(String value) {
		this.value = value;
	}
	
	@Override
	public Relation getParent() {
        return FamilySubCategory.EXTENDED;
    }

    public String getValue() {
		return this.value;
	}

}
