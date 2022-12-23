package com.example.demo.enumpolymorphism;

public enum SubCategoryProfessional implements RelationInterface {

	WORK("Work"),
    PERSONAL("Personal");
    
    private String value;
	
    SubCategoryProfessional(String value) {
		this.value = value;
	}
    
    public String getValue() {
		return this.value;
	}

	@Override
	public CategoryRelation getCategoryRelation() {
		return CategoryRelation.PROFESSIONAL;
	}
}
