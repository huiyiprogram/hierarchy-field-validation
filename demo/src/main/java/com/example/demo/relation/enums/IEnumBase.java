package com.example.demo.relation.enums;

import java.util.List;

public interface IEnumBase {
	
	enum HierarchyTier {
		CATEGORY, SUBCATEGORY, CHILD
	}

	List<IEnumBase> getEnumList();

	Object getCategory();

	Object getSubCategory();

	Object getChild();
	
	Object getEnumByValue(HierarchyTier tier, String value);
	
}
