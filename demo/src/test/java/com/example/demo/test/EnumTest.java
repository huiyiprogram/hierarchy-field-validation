package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.common.enums.Relation;
import com.example.demo.enumpolymorphism.CategoryRelation;
import com.example.demo.enumpolymorphism.RelationInterface;
import com.example.demo.enumpolymorphism.SubCategoryFamily;
import com.example.demo.enumpolymorphism.SubCategoryProfessional;

public class EnumTest {
	
	// Enum Polymorphism
	@Test
    public void testValidCategoryFromCategoryRelation() {

        // Family
        RelationInterface family = RelationInterface.fromCategoryValue("Family").orElse(null);
        assertEquals(CategoryRelation.FAMILY, family);
        
        // Professional
        RelationInterface professional = RelationInterface.fromCategoryValue("Professional").orElse(null);
        assertEquals(CategoryRelation.PROFESSIONAL, professional);
	 }
	
	// Enum Polymorphism
	@Test
    public void testValidSubCategoryRelationFromValue() {
        // Family
		RelationInterface familyImmediate = RelationInterface.fromSubCategoryValue("Immediate").orElse(null);
        assertEquals(SubCategoryFamily.IMMEDIATE, familyImmediate);
        
        RelationInterface familyExtended = RelationInterface.fromSubCategoryValue("Extended").orElse(null);
        assertEquals(SubCategoryFamily.EXTENDED, familyExtended);
        
        // Professional
        RelationInterface professionalWork = RelationInterface.fromSubCategoryValue("Work").orElse(null);
        assertEquals(SubCategoryProfessional.WORK, professionalWork);
        
        RelationInterface professionalPersonal = RelationInterface.fromSubCategoryValue("Personal").orElse(null);
        assertEquals(SubCategoryProfessional.PERSONAL, professionalPersonal);
	}
	
	// Enum Polymorphism
	@Test
    public void testValidRelationFromValue() {
		
		// Family > Immediate
		RelationInterface parent = RelationInterface.fromRelationValue("Parent").orElse(null);
        assertEquals(Relation.PARENT, parent);
        
        RelationInterface child = RelationInterface.fromRelationValue("Child").orElse(null);
        assertEquals(Relation.CHILD, child);
        
        RelationInterface spouse = RelationInterface.fromRelationValue("Spouse").orElse(null);
        assertEquals(Relation.SPOUSE, spouse);
        
        RelationInterface sibling = RelationInterface.fromRelationValue("Sibling").orElse(null);
        assertEquals(Relation.SIBLING, sibling);
        
        // Family > Extended
        RelationInterface grandparent = RelationInterface.fromRelationValue("Grandparent").orElse(null);
        assertEquals(Relation.GRANDPARENT, grandparent);
        
        RelationInterface cousin = RelationInterface.fromRelationValue("Cousin").orElse(null);
        assertEquals(Relation.COUSIN, cousin);
        
        RelationInterface uncle = RelationInterface.fromRelationValue("Uncle").orElse(null);
        assertEquals(Relation.UNCLE, uncle);
        
        // Professional > Personal
        RelationInterface driver = RelationInterface.fromRelationValue("Driver").orElse(null);
        assertEquals(Relation.DRIVER, driver);
        
        RelationInterface bodyguard = RelationInterface.fromRelationValue("Body Guard").orElse(null);
        assertEquals(Relation.BODYGUARD, bodyguard);
        
        // Professional > Work
        RelationInterface superior = RelationInterface.fromRelationValue("Superior").orElse(null);
        assertEquals(Relation.SUPERIOR, superior);
        
        RelationInterface subordinate = RelationInterface.fromRelationValue("Subordinate").orElse(null);
        assertEquals(Relation.SUBORDINATE, subordinate);
	}
	
	// Enum Polymorphism
	@Test
    public void testInvalidValue() {
		// Category
        assertNull(RelationInterface.fromCategoryValue("000").orElse(null));
		// Sub Category
        assertNull(RelationInterface.fromSubCategoryValue("000").orElse(null));
        // Relation
        assertNull(RelationInterface.fromRelationValue("000").orElse(null));
    }
	

}
