package com.example.demo.common.enums;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "RelationHierarchy")
public class RelationHierarchy {

	private String _id;
	
	private String parent;
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

}
