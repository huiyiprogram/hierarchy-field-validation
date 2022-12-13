package com.example.demo.relation.enums;

public enum RelationSubCategory {
		
    IMMEDIATE("Immediate"),
    EXTENDED("Extended"),
    WORK("Work"),
    PERSONAL("Personal");

	private String value;
	
    RelationSubCategory(String value) {
		this.value = value;
	}
    
    public String getValue() {
		return this.value;
	}
}