package com.example.demo.relation;

@HierarchyValidation.List({ 
	@HierarchyValidation(
      category = "category", 
      subCategory = "subCategory", 
      child = "finalRelation",
	  enumBase = "RelationMap",
      message = "Invalid Hierarchy Structure!"
    )
})
public class RelationClass {
	
	private String category;
	private String subCategory;
	private String finalRelation;

	public RelationClass(String category, String subCategory, String finalRelation) {
		this.category = category;
		this.subCategory = subCategory;
		this.finalRelation = finalRelation;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getFinalRelation() {
		return finalRelation;
	}
	public void setFinalRelation(String finalRelation) {
		this.finalRelation = finalRelation;
	}

}
