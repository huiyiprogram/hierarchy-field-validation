package com.example.demo.common.enums;

import com.example.demo.common.enums.IHierarchyEnumBase.HierarchyValidationStrategy;
import com.example.demo.common.validation.HierarchyValidation;
import com.example.demo.enumadvanced.RelationChildAdvanced;


// Change validationEnum(Which enum to check against), strategy according to preference
@HierarchyValidation.List({ 
	@HierarchyValidation(
		category = "category", 
		subCategory = "subCategory", 
		child = "finalRelation",
		validationEnum = RelationChildAdvanced.class,
		strategy = HierarchyValidationStrategy.ENUM_STRATEGY_PATTERN,
		message = "Invalid Relation Hierarchy Structure!"
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
