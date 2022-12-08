package com.example.demo.relation.enums;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.example.demo.relation.Relation;

public enum FamilyExtendedRelation implements Relation {
	
    GRANDPARENT("Grandparent"),
    COUSIN("Cousin"),
    UNCLE("Uncle");
	
	private String value;
	
	FamilyExtendedRelation(String value) {
		this.value = value;
	}
	
	@Override
	public String getParent() {
        return FamilySubCategory.EXTENDED.getValue();
    }

    public String getValue() {
		return this.value;
	}

	@Override
	public Optional<Relation> getEnum(String value) {
		List<Relation> relationList = List.of(FamilyExtendedRelation.values());
		Optional<Relation> relationEnum = Stream.of(relationList)
				.flatMap(List::stream)
		        .filter(type -> type.getValue().equals(value))
		        .findFirst();
		return relationEnum;
	}

}
