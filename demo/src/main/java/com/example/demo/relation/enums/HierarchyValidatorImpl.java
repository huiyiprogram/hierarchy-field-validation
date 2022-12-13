package com.example.demo.relation.enums;

public class HierarchyValidatorImpl implements IHierarchyValidator {
//implements 
//  ConstraintValidator<ContactNumberConstraint, String> {
//
//    @Override
//    public void initialize(ContactNumberConstraint contactNumber) {
//    }
//
//    @Override
//    public boolean isValid(String contactField,
//      ConstraintValidatorContext cxt) {
//        return contactField != null && contactField.matches("[0-9]+")
//          && (contactField.length() > 8) && (contactField.length() < 14);
//    }
	
    public void hierarchyValidation(IEnumBase a) {
    	
    	System.out.println(a);
    }

	@Override
	public void hierarchyValidation(String category, String subCategory, String finalValue) {
		// TODO Auto-generated method stub
		
	};

}
