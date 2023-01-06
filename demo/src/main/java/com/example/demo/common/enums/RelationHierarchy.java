package com.example.demo.common.enums;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "RelationHierarchy")
public class RelationHierarchy {
	@Id
	private Object id;
	
	private String parent;

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
}
