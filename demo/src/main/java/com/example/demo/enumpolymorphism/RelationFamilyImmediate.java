package com.example.demo.enumpolymorphism;

public enum RelationFamilyImmediate implements RelationInterface {

	PARENT("Parent"),
	CHILD("Child"),
	SPOUSE("Spouse"),
	SIBLING("Sibling");
	
	private String value;
	
	RelationFamilyImmediate(String value) {
		this.value = value;
	}
    
    public String getValue() {
		return this.value;
	}
    
    @Override
	public CategoryRelation getCategory() {
		return CategoryRelation.FAMILY;
	}

	@Override
	public RelationInterface getSubCategory() {
		return SubCategoryFamily.IMMEDIATE;
	}
	
}
