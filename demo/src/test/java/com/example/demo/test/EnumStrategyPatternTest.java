package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.enumstrategy.HierarchyValidationService;
import com.example.demo.enumstrategy.RelationClass;

import jakarta.validation.ConstraintViolationException;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EnumStrategyPatternTest {
	
	private String string = "category";
	
	@Autowired
    private HierarchyValidationService service;
	
//	@Test
//	void whenInputIsInvalid_thenThrowsException() {
////		@Valid RelationClass relation = new RelationClass("Family", "Immediate", "Parent");
////		System.out.println(relation.getCategory());
//		
//	    assertThrows(ConstraintViolationException.class, () -> {
//	      service.validateInput(string);
//	    });
//	}

	@Test
	  void givenInjectedValidator_whenInputIsInvalid_thenThrowsException(){
		RelationClass input = new RelationClass("Family", "Immediate", "Parent");
//		service.validateInputWithInjectedValidator(input);
	    assertThrows(ConstraintViolationException.class, () -> {
	      service.validateInputWithInjectedValidator(input);
	    });
	  }

}