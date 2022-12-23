package com.example.demo.common.enums;

public enum RelationCategory {
	
    FAMILY("Family"),
    PROFESSIONAL("Professional");
    
    private String value;
	
    RelationCategory(String value) {
        this.value = value;
    }
    
	public String getValue() {
		return this.value;
	}

}
