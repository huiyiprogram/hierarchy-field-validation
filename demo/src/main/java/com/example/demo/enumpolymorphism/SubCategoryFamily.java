package com.example.demo.enumpolymorphism;

public enum SubCategoryFamily implements RelationInterface {

    IMMEDIATE("Immediate"),
    EXTENDED("Extended");
    
    private String value;
	
    SubCategoryFamily(String value) {
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
		// TODO Auto-generated method stub
		return null;
	}

}
