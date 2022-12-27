package com.example.demo.enumpolymorphism;

public enum CategoryRelation implements RelationInterface {
	
    FAMILY("Family"),
    PROFESSIONAL("Professional");
    
    private String value;
	
    CategoryRelation(String value) {
        this.value = value;
    }
    
	public String getValue() {
		return this.value;
	}

	@Override
	public CategoryRelation getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelationInterface getSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
