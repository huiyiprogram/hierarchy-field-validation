package com.example.demo.enumadvanced;

import com.example.demo.common.enums.RelationCategory;
import com.example.demo.common.enums.RelationSubCategory;

// ** Enum that holds the hierarchy mapping of
// ** Relation Category > Relation Sub Category > Relation
// ** Can consider splitting into multiple files for different SubCategory
public enum RelationChildAdvanced implements IEnumBaseAdvanced {
	
	// Family > Immediate
	PARENT("Parent") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.IMMEDIATE.getValue();
		}

	}, CHILD("Child") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.IMMEDIATE.getValue();
		}

	}, SPOUSE("Spouse") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.IMMEDIATE.getValue();
		}

	}, SIBLING("Sibling") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.IMMEDIATE.getValue();
		}

	},
	//	 Family > Extended
	GRANDPARENT("Grandparent") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.EXTENDED.getValue();
		}

	},
	COUSIN("Cousin") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.EXTENDED.getValue();
		}

	},
	UNCLE("Uncle") {
		@Override
		public String getCategory() {
			return RelationCategory.FAMILY.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.EXTENDED.getValue();
		}

	},
	// Professional > Work
	SUPERIOR("Superior") {
		@Override
		public String getCategory() {
			return RelationCategory.PROFESSIONAL.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.WORK.getValue();
		}

	},
	SUBORDINATE("Subordinate") {
		@Override
		public String getCategory() {
			return RelationCategory.PROFESSIONAL.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.WORK.getValue();
		}

	},
	// Professional > Personal
	DRIVER("Driver") {
		@Override
		public String getCategory() {
			return RelationCategory.PROFESSIONAL.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.PERSONAL.getValue();
		}

	},
	BODYGUARD("Body Guard") {
		@Override
		public String getCategory() {
			return RelationCategory.PROFESSIONAL.getValue();
		}

		@Override
		public String getSubCategory() {
			return RelationSubCategory.PERSONAL.getValue();
		}

	};
	
	private String value;

	RelationChildAdvanced(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}

}