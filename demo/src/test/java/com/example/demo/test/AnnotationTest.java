package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.common.enums.RelationDTO;
import com.example.demo.common.validation.HierarchyValidationService;

import jakarta.validation.ConstraintViolationException;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AnnotationTest {
	
	@Autowired
    private HierarchyValidationService service;
	
	// Family > Immediate
	@Test
	void testFamilyImmediateParent_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Immediate", "Parent");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyImmediateChild_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Immediate", "Child");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyImmediateSpouse_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Immediate", "Spouse");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyImmediateSibling_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Immediate", "Sibling");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}

	@Test
	void testFamilyImmediate_thenThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Immediate", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Family > Extended
	@Test
	void testFamilyExtendedGrandparent_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Extended", "Grandparent");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyExtendedCousin_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Extended", "Cousin");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyExtendedUncle_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Extended", "Uncle");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testFamilyExtended_thenThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Extended", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Family
	@Test
	void testFamily_thenThrowsException() {
		RelationDTO input = new RelationDTO("Family", "Test1", "Test2");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Professional > Work
	@Test
	void testProfessionalWorkSuperior_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Work", "Superior");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalWorkSubordinate_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Work", "Subordinate");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalWork_thenThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Work", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Professional > Personal
	@Test
	void testProfessionalPersonalDriver_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Personal", "Driver");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalPersonalBodyguard_thenDoNotThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Personal", "Body Guard");
		assertDoesNotThrow(() -> service.validateInputWithInjectedValidator(input));
	}
	
	@Test
	void testProfessionalPersonal_thenThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Personal", "Test");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// Professional
	@Test
	void testProfessional_thenThrowsException() {
		RelationDTO input = new RelationDTO("Professional", "Test1", "Test2");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
	// All fields invalid values
	@Test
	void testAllFieldsInvalidValues_thenThrowsException() {
		RelationDTO input = new RelationDTO("Test1", "Test2", "Test3");
		assertThrows(ConstraintViolationException.class, () -> {
			service.validateInputWithInjectedValidator(input);
	    });
	}
	
}

