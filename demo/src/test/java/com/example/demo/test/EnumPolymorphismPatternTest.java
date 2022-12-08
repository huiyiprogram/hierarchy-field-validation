package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.relation.Relation;

public class EnumPolymorphismPatternTest {

    @Test
    public void shouldReturnIsValidRelationHierarchy() {
        // Family
    	// Immediate
		boolean parent = Relation.isValidRelationHierarchy("Family", "Immediate", "Parent");
		assertTrue(parent);
		
//		boolean child = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final Infinite 2");
//		assertTrue(child);
//		
//		boolean spouse = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final Infinite 3");
//		assertTrue(spouse);
//		
//		boolean sibling = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final Infinite 3");
//		assertTrue(sibling);
//		
//		// Extended
//		boolean grandparent = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final Infinite 2");
//		assertTrue(grandparent);
//		
//		boolean cousin = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final Infinite 3");
//		assertTrue(cousin);
//		
//		boolean uncle = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final Infinite 3");
//		assertTrue(uncle);
		
//		// Professional
//		boolean standard1 = Relation.isValidRelationHierarchy("Mastercard", "Standard", "Final Standard 1");
//		assertTrue(standard1);
//		
//		boolean standard2 = Relation.isValidRelationHierarchy("Mastercard", "Standard", "Final Standard 2");
//		assertTrue(standard2);
//
//		boolean standard3 = Relation.isValidRelationHierarchy("Mastercard", "Standard", "Final Standard 3");
//		assertTrue(standard3);
    }

//    @Test
//    public void shouldReturnNotIsValidRelationHierarchy() {
//    	// VISA
//    	// Invalid cardType
//		boolean mastercardInfinite1 = Relation.isValidRelationHierarchy("Mastercard", "Infinite", "Final Infinite 1");
//		assertFalse(mastercardInfinite1);
//		
//		boolean mastercardInfinite2 = Relation.isValidRelationHierarchy("Mastercard", "Infinite", "Final Infinite 2");
//		assertFalse(mastercardInfinite2);
//		
//		boolean mastercardInfinite3 = Relation.isValidRelationHierarchy("Mastercard", "Infinite", "Final Infinite 3");
//		assertFalse(mastercardInfinite3);
//    	
//		// Invalid subCardType
//		boolean standardInfinite1 = Relation.isValidRelationHierarchy("Visa", "Standard", "Final Infinite 1");
//		assertFalse(standardInfinite1);
//		
//		boolean standardInfinite2 = Relation.isValidRelationHierarchy("Visa", "Standard", "Final Infinite 2");
//		assertFalse(standardInfinite2);
//		
//		boolean standardInfinite3 = Relation.isValidRelationHierarchy("Visa", "Standard", "Final Infinite 3");
//		assertFalse(standardInfinite3);
//		
//		// Invalid cardValue
//		boolean visaRandom1 = Relation.isValidRelationHierarchy("Visa", "Infinite", "Final random 1");
//		assertFalse(visaRandom1);
//		
//		// MASTERCARD
//		// Invalid cardType
//		boolean visaStandard1 = Relation.isValidRelationHierarchy("Visa", "Standard", "Final Standard 1");
//		assertFalse(visaStandard1);
//		
//		boolean visaStandard2 = Relation.isValidRelationHierarchy("Visa", "Standard", "Final Standard 2");
//		assertFalse(visaStandard2);
//
//		boolean visaStandard3 = Relation.isValidRelationHierarchy("Visa", "Standard", "Final Standard 3");
//		assertFalse(visaStandard3);
//		
//		// Invalid subCardType
//		boolean infiniteStandard1 = Relation.isValidRelationHierarchy("Mastercard", "Infinite", "Final Standard 1");
//		assertFalse(infiniteStandard1);
//		
//		boolean infiniteStandard2 = Relation.isValidRelationHierarchy("Mastercard", "Infinite", "Final Standard 2");
//		assertFalse(infiniteStandard2);
//
//		boolean infiniteStandard3 = Relation.isValidRelationHierarchy("Mastercard", "Infinite", "Final Standard 3");
//		assertFalse(infiniteStandard3);
//		
//		// Invalid cardValue
//		boolean mastercardRandom1 = Relation.isValidRelationHierarchy("Mastercard", "Standard", "Final random 1");
//		assertFalse(mastercardRandom1);
//    }
}