package testAnnotation;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.common.enums.RelationDTO;

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

  void validateInputWithInjectedValidator(RelationDTO relation) {
    Set<ConstraintViolation<RelationDTO>> violations = validator.validate(relation);
    if (!violations.isEmpty()) {
      throw new ConstraintViolationException(violations);
    }
  }
  
  void validateInput(RelationDTO relation) {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();
	    Set<ConstraintViolation<RelationDTO>> violations = validator.validate(relation);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }
}