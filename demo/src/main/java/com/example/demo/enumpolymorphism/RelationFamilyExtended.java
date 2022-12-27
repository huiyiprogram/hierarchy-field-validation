package com.example.demo.enumpolymorphism;

public enum RelationFamilyExtended implements RelationInterface {

	GRANDPARENT("Grandparent"),
	COUSIN("Cousin"),
	UNCLE("Uncle");
	
	private String value;
	
	RelationFamilyExtended(String value) {
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
		return SubCategoryFamily.EXTENDED;
	}

}
