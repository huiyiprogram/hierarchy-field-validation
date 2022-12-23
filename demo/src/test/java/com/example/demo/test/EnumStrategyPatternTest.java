package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.enumstrategy.HierarchyValidationService;
import com.example.demo.enumstrategy.RelationClass;

import jakarta.validation.ConstraintViolationException;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EnumStrategyPatternTest {
	
	@Autowired
    private HierarchyValidationService service;
	
	// Family > Immediate
	@Test
	void testFamilyImmediateParent_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Immediate", "Parent");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyImmediateChild_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Immediate", "Child");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyImmediateSpouse_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Immediate", "Spouse");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyImmediateSibling_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Immediate", "Sibling");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}

	@Test
	void testFamilyImmediate_thenThrowsException() {
		RelationClass input = new RelationClass("Family", "Immediate", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Family > Extended
	@Test
	void testFamilyExtendedGrandparent_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Extended", "Grandparent");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyExtendedCousin_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Extended", "Cousin");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyExtendedUncle_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Family", "Extended", "Uncle");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyExtended_thenThrowsException() {
		RelationClass input = new RelationClass("Family", "Extended", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Family
	@Test
	void testFamily_thenThrowsException() {
		RelationClass input = new RelationClass("Family", "Test1", "Test2");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Professional > Work
	@Test
	void testProfessionalWorkSuperior_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Professional", "Work", "Superior");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalWorkSubordinate_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Professional", "Work", "Subordinate");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalWork_thenThrowsException() {
		RelationClass input = new RelationClass("Professional", "Work", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Professional > Personal
	@Test
	void testProfessionalPersonalDriver_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Professional", "Personal", "Driver");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalPersonalBodyguard_thenDoNotThrowsException() {
		RelationClass input = new RelationClass("Professional", "Personal", "Body Guard");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalPersonal_thenThrowsException() {
		RelationClass input = new RelationClass("Professional", "Personal", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Professional
	@Test
	void testProfessional_thenThrowsException() {
		RelationClass input = new RelationClass("Professional", "Test1", "Test2");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// All fields invalid values
	@Test
	void testAllFieldsInvalidValues_thenThrowsException() {
		RelationClass input = new RelationClass("Test1", "Test2", "Test3");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
}

