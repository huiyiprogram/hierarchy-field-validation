package com.example.demo.relation.enums;

import java.util.List;

public interface IEnumBase {

	List<IEnumBase> getEnumList();

	Object getCategory();

	Object getSubCategory();

	Object getChild();
	
}
