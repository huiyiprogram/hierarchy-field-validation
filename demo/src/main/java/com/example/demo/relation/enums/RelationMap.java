package com.example.demo.relation.enums;

import java.util.List;

// ** Validator that holds the hierarchy mapping of
// ** Relation Category > Relation Sub Category > Relation
public enum RelationMap implements IEnumBase {
	
	// Family > Immediate
	FAM_IMM_PARENT(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.PARENT),
	FAM_IMM_CHILD(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.CHILD),
	FAM_IMM_SPOUSE(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.SPOUSE),
	FAM_IMM_SIBLING(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.SIBLING),
	
	// Family > Extended
	FAM_EXT_GRANDPARENT(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.PARENT),
	FAM_EXT_COUSIN(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.CHILD),
	FAM_EXT_UNCLE(RelationCategory.FAMILY, RelationSubCategory.IMMEDIATE, Relation.SPOUSE),
	
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
    
}