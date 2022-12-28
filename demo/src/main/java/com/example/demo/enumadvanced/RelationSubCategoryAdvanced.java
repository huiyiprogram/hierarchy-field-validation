package com.example.demo.enumadvanced;

public enum RelationSubCategoryAdvanced {
		
    IMMEDIATE("Immediate"),
    EXTENDED("Extended"),
    WORK("Work"),
    PERSONAL("Personal");

	private String value;
	
    RelationSubCategoryAdvanced(String value) {
		this.value = value;
	}
    
    public String getValue() {
		return this.value;
	}
}