package com.example.demo.enumstrategy;

import com.example.demo.relation.enums.RelationMap;

@HierarchyValidation.List({ 
	@HierarchyValidation(
      category = "category", 
      subCategory = "subCategory", 
      child = "finalRelation",
	  enumBase = RelationMap.class,
      message = "Invalid Hierarchy Structure!"
    )
})
public class RelationClass {
	
//	@CategoryValidation
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
