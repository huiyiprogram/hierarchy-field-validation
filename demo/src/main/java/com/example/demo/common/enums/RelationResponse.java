package com.example.demo.common.enums;

public class RelationResponse {
	
	private String category;
	private String subCategory;
	private String finalRelation;

	public RelationResponse(String category, String subCategory, String finalRelation) {
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
