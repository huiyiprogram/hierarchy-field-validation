package com.example.demo.common.enums;

public enum Relation {
	
	// Family > Immediate
	PARENT("Parent"),
	CHILD("Child"),
	SPOUSE("Spouse"),
	SIBLING("Sibling"),
	// Family > Extended
	GRANDPARENT("Grandparent"),
	COUSIN("Cousin"),
	UNCLE("Uncle"),

	// Professional > Personal
	DRIVER("Driver"),
	BODYGUARD("Body Guard"),
	// Professional > Work
	SUPERIOR("Superior"),
	SUBORDINATE("Subordinate");

	private String value;

	Relation(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
	
}
