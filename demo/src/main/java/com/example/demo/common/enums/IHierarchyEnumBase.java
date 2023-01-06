package com.example.demo.common.enums;

import java.util.List;

// Interface for hierarchy enums
public interface IHierarchyEnumBase {
	
	enum HierarchyTier {
		CATEGORY, SUBCATEGORY, CHILD
	}
	
	enum HierarchyValidationStrategy {
		ENUM_POLYMORPHISM, ENUM_STRATEGY_PATTERN, ENUM_STRATEGY_STATICMAP,
		TREE_STRUCTURE_PARENT_REF
	}

	List<IHierarchyEnumBase> getEnumList();

	Object getCategory();

	Object getSubCategory();

	Object getChild();
	
	Object getEnumByValue(HierarchyTier tier, String value);
	
}
