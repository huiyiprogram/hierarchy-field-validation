package testAnnotation;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.relation.RelationClass;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@Service
class CategoryValidationService {

  private Validator validator;

  CategoryValidationService(Validator validator) {
    this.validator = validator;
  }

  void validateInputWithInjectedValidator(RelationClass relation) {
    Set<ConstraintViolation<RelationClass>> violations = validator.validate(relation);
    if (!violations.isEmpty()) {
      throw new ConstraintViolationException(violations);
    }
  }
  
  void validateInput(RelationClass relation) {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();
	    Set<ConstraintViolation<RelationClass>> violations = validator.validate(relation);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }
}