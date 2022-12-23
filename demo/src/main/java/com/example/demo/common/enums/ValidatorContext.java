package com.example.demo.common.enums;

//@Documented
//@Constraint(validatedBy = ContactNumberValidator.class)
//@Target( { ElementType.METHOD, ElementType.FIELD })
//@Retention(RetentionPolicy.RUNTIME)
public class ValidatorContext {
	private HierarchyValidatorImpl strategy;
	private IEnumBase enumBase;

    public ValidatorContext(HierarchyValidatorImpl strategy, IEnumBase enumBase) {
        this.strategy = strategy;
        this.enumBase = enumBase;
    }

    public void setValidator(HierarchyValidatorImpl validator, IEnumBase enumBase) {
        this.strategy = validator;
        this.enumBase = enumBase;
    }

    public void runValidation(String content) {
        strategy.hierarchyValidation(content, content, content);
    }
    
//    public RelationCategory getParent() {
//       return SubCategoryValidator.getCategoryByValue(strategy.getValue());
//    }
}
