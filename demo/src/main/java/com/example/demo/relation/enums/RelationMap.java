package com.example.demo.relation.enums;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// ** Validator that holds the hierarchy mapping of
// ** Relation Category > Relation Sub Category > Relation
public enum RelationMap implements IEnumBase {
	
	// Family > Immediate
	FAM_IMM_PARENT(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.PARENT),
	FAM_IMM_CHILD(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.CHILD),
	FAM_IMM_SPOUSE(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.SPOUSE),
	FAM_IMM_SIBLING(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.SIBLING),
	
	// Family > Extended
	FAM_EXT_GRANDPARENT(RelationCategory.FAMILY, RelationSubCategory.EXTENDED, Relation.GRANDPARENT),
	FAM_EXT_COUSIN(RelationCategory.FAMILY, RelationSubCategory.EXTENDED, Relation.COUSIN),
	FAM_EXT_UNCLE(RelationCategory.FAMILY, RelationSubCategory.EXTENDED, Relation.UNCLE),
	
	// Professional > Work
	PRO_WORK_SUPERIOR(RelationCategory.PROFESSIONAL, RelationSubCategory.WORK, Relation.SUPERIOR),
	PRO_WORK_SUBORDINATE(RelationCategory.PROFESSIONAL, RelationSubCategory.WORK, Relation.SUBORDINATE),
	
	// Professional > Personal
	PRO_PERSONAL_DRIVER(RelationCategory.PROFESSIONAL, RelationSubCategory.PERSONAL, Relation.DRIVER),
	PRO_PERSONAL_BODYGUARD(RelationCategory.PROFESSIONAL, RelationSubCategory.PERSONAL, Relation.BODYGUARD);

	private RelationCategory category;
	private RelationSubCategory subCategory;
	private Relation relation;
	
	RelationMap(RelationCategory category, RelationSubCategory subCategory, Relation relation) {
		this.category = category;
		this.subCategory = subCategory;
		this.relation = relation;
	}

	@Override
	public RelationCategory getCategory() {
		return this.category;
	}
	
	@Override
	public RelationSubCategory getSubCategory() {
		return this.subCategory;
	}
	
	@Override
	public Relation getChild() {
		return this.relation;
	}
	
    public RelationCategory getCategoryByValue(String a) {
    	for (RelationMap subCat : RelationMap.values()) {
            if (subCat.getChild().getValue().equalsIgnoreCase(a)) {
                return subCat.getCategory();
            }
        }
        return null;
    }

	@Override
	public List<IEnumBase> getEnumList() {
		List<IEnumBase> enumBaseList = List.of(RelationMap.values());
		return enumBaseList;
	}

	@Override
	public Object getEnumByValue(HierarchyTier tier, String value) {
		switch(tier) {
		case CATEGORY:
			Optional<RelationCategory> relationCategory = Stream.of(List.of(RelationCategory.values()))
			        .flatMap(List::stream)
			        .filter(type -> type.getValue().equals(value))
			        .findFirst();
			
			if(relationCategory.isPresent()) {
				return relationCategory.get();
			}
			break;
		case SUBCATEGORY:
			Optional<RelationSubCategory> relationSubCategory = Stream.of(List.of(RelationSubCategory.values()))
			        .flatMap(List::stream)
			        .filter(type -> type.getValue().equals(value))
			        .findFirst();
			
			if(relationSubCategory.isPresent()) {
				return relationSubCategory.get();
			}
			break;
		case CHILD:
			Optional<Relation> relation = Stream.of(List.of(Relation.values()))
			        .flatMap(List::stream)
			        .filter(type -> type.getValue().equals(value))
			        .findFirst();
			
			if(relation.isPresent()) {
				return relation.get();
			}
			break;
		default:
			break;
		}
		
		return null;
	}
    
}