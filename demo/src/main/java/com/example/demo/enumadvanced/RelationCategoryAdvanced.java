package com.example.demo.enumadvanced;

public enum RelationCategoryAdvanced {
	
    FAMILY("Family"),
    PROFESSIONAL("Professional");
    
    private String value;
	
    RelationCategoryAdvanced(String value) {
        this.value = value;
    }
    
	public String getValue() {
		return this.value;
	}

}
