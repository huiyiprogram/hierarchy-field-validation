package com.example.demo.common.enums;

import java.util.List;

public interface IEnumBase {
	
	enum HierarchyTier {
		CATEGORY, SUBCATEGORY, CHILD
	}
	
	enum HierarchyValidationStrategy {
		ENUM_POLYMORPHISM, ENUM_STRATEGY, ENUM_STRATEGY_STATICMAP
	}

	List<IEnumBase> getEnumList();

	Object getCategory();

	Object getSubCategory();

	Object getChild();
	
	Object getEnumByValue(HierarchyTier tier, String value);
	
}
