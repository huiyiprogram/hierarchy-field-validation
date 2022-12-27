package com.example.demo.enumpolymorphism;

public enum RelationProfessionalPersonal implements RelationInterface {

	DRIVER("Driver"),
	BODYGUARD("Body Guard");
	
	private String value;
	
	RelationProfessionalPersonal(String value) {
		this.value = value;
	}
    
    public String getValue() {
		return this.value;
	}
    
    @Override
	public CategoryRelation getCategory() {
		return CategoryRelation.PROFESSIONAL;
	}

	@Override
	public RelationInterface getSubCategory() {
		return SubCategoryProfessional.PERSONAL;
	}
	
}
