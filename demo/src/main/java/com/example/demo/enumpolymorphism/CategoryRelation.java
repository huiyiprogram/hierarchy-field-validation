package com.example.demo.enumpolymorphism;

public enum CategoryRelation {
	
    FAMILY("Family"),
    PROFESSIONAL("Professional");
    
    private String value;
	
    CategoryRelation(String value) {
        this.value = value;
    }
    
	public String getValue() {
		return this.value;
	}
	
}
