package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.common.validation.HierarchyValidationService;
import com.example.demo.enumpolymorphism.CategoryRelation;
import com.example.demo.enumpolymorphism.RelationInterface;
import com.example.demo.enumpolymorphism.SubCategoryFamily;
import com.example.demo.enumpolymorphism.SubCategoryProfessional;

public class EnumPolymorphismPatternTest {
	
	@Test
    public void testValidSubCategoryRelationFromValue() {
        // Family
		RelationInterface familyImmediate = RelationInterface.fromValue("Immediate").orElse(null);
        assertEquals(SubCategoryFamily.IMMEDIATE, familyImmediate);
        
        RelationInterface familyExtended = RelationInterface.fromValue("Extended").orElse(null);
        assertEquals(SubCategoryFamily.EXTENDED, familyExtended);
        
        // Professional
        RelationInterface professionalWork = RelationInterface.fromValue("Work").orElse(null);
        assertEquals(SubCategoryProfessional.WORK, professionalWork);
        
        RelationInterface professionalPersonal = RelationInterface.fromValue("Personal").orElse(null);
        assertEquals(SubCategoryProfessional.PERSONAL, professionalPersonal);
	}
	
	@Test
    public void testInvalidSubCategoryRelationFromValue() {
        assertNull(RelationInterface.fromValue("000").orElse(null));
    }
	
	 @Test
    public void testValidCategoryFromCategoryRelation() {

        // Family
        boolean allFamily = RelationInterface.fromCategoryRelation(CategoryRelation.FAMILY).stream()
                .allMatch(subCategory -> subCategory.getCategory().equals(CategoryRelation.FAMILY));
        assertTrue(allFamily);
        
        // Professional
        boolean allProfessional = RelationInterface.fromCategoryRelation(CategoryRelation.PROFESSIONAL).stream()
                .allMatch(subCategory -> subCategory.getCategory().equals(CategoryRelation.PROFESSIONAL));
        assertTrue(allProfessional);
	 }
}
