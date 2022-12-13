package com.example.demo.relation.enums;

public enum SubCategoryValidator {

	IMMEDIATE("Immediate", RelationCategory.FAMILY),
    EXTENDED("Extended", RelationCategory.FAMILY),
    WORK("Work", RelationCategory.PROFESSIONAL),
    PERSONAL("Personal", RelationCategory.PROFESSIONAL);

	void doValidation(String content, SubCategoryValidator subCat) {
		switch(subCat)
		{
		case IMMEDIATE:
		case EXTENDED:
			System.out.println("FAMILY CONTEXT");
			anotherValidation(content);
			break;
		default:
			System.out.println("DEFAULT Content: " + content);
			break;
		}
	};
	
	void anotherValidation(String content) {
		System.out.println("ANOTHER VALIDATION Content: " + content);
	}
	
	private String value;
	private RelationCategory category;
	
	SubCategoryValidator(String value, RelationCategory category) {
		this.value = value;
		this.category = category;
	}
    
    public String getValue() {
		return this.value;
	}

	public RelationCategory getCategory() {
		return this.category;
	}
	
    public static RelationCategory getCategoryByValue(String a) {
    	for (SubCategoryValidator subCat : SubCategoryValidator.values()) {
            if (subCat.getValue().equalsIgnoreCase(a)) {
                return subCat.getCategory();
            }
        }
        return null;
    }

}