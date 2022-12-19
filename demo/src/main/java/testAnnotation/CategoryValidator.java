package testAnnotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CategoryValidator implements ConstraintValidator<CategoryValidation, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println("CategoryValidator - Value: " + value);
		
		// TODO Auto-generated method stub
		return false;
	}

}
