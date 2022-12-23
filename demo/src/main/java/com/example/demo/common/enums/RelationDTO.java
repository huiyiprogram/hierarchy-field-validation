package com.example.demo.common.enums;

import com.example.demo.common.enums.IEnumBase.HierarchyValidationStrategy;
import com.example.demo.enumstrategy.staticmap.HierarchyValidation;
import com.example.demo.enumstrategy.staticmap.RelationMap;
import com.example.demo.enumstrategy.staticmap.HierarchyValidation.List;

@HierarchyValidation.List({ 
	@HierarchyValidation(
		category = "category", 
		subCategory = "subCategory", 
		child = "finalRelation",
		enumBase = RelationMap.class,
		message = "Invalid Relation Hierarchy Structure!",
		strategy = HierarchyValidationStrategy.ENUM_POLYMORPHISM
    )
})
public class RelationDTO {
	
	private String category;
	private String subCategory;
	private String finalRelation;

	public RelationDTO(String category, String subCategory, String finalRelation) {
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
