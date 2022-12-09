package com.example.demo.relation.enums;

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
    public Relation getParent() {
        return RelationCategory.FAMILY;
    }
    
}