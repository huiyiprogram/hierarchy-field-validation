package com.example.demo.common.enums;

public interface IHierarchyValidator {
	public void hierarchyValidation(String category, String subCategory, String finalValue);
	
	static boolean isValid(String category, String subCategory, String finalValue) {
		
		return false;
	}
}
