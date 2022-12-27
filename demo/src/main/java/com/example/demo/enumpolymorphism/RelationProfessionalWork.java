package com.example.demo.enumpolymorphism;

public enum RelationProfessionalWork implements RelationInterface {

	SUPERIOR("Superior"),
	SUBORDINATE("Subordinate");
	
	private String value;
	
	RelationProfessionalWork(String value) {
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
   		return SubCategoryProfessional.WORK;
   	}
	
}
