package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EnumPolymorphismPatternTest {

    @Test
    public void shouldReturnIsValidCardHierarchy() {
        // VISA
		boolean infinite1 = CardLogoType.isValidCardHierarchy("Visa", "Infinite", "Final Infinite 1");
		assertTrue(infinite1);
		
		boolean infinite2 = CardLogoType.isValidCardHierarchy("Visa", "Infinite", "Final Infinite 2");
		assertTrue(infinite2);
		
		boolean infinite3 = CardLogoType.isValidCardHierarchy("Visa", "Infinite", "Final Infinite 3");
		assertTrue(infinite3);
		
		// MASTERCARD
		boolean standard1 = CardLogoType.isValidCardHierarchy("Mastercard", "Standard", "Final Standard 1");
		assertTrue(standard1);
		
		boolean standard2 = CardLogoType.isValidCardHierarchy("Mastercard", "Standard", "Final Standard 2");
		assertTrue(standard2);

		boolean standard3 = CardLogoType.isValidCardHierarchy("Mastercard", "Standard", "Final Standard 3");
		assertTrue(standard3);
    }

    @Test
    public void shouldReturnNotIsValidCardHierarchy() {
    	// VISA
    	// Invalid cardType
		boolean mastercardInfinite1 = CardLogoType.isValidCardHierarchy("Mastercard", "Infinite", "Final Infinite 1");
		assertFalse(mastercardInfinite1);
		
		boolean mastercardInfinite2 = CardLogoType.isValidCardHierarchy("Mastercard", "Infinite", "Final Infinite 2");
		assertFalse(mastercardInfinite2);
		
		boolean mastercardInfinite3 = CardLogoType.isValidCardHierarchy("Mastercard", "Infinite", "Final Infinite 3");
		assertFalse(mastercardInfinite3);
    	
		// Invalid subCardType
		boolean standardInfinite1 = CardLogoType.isValidCardHierarchy("Visa", "Standard", "Final Infinite 1");
		assertFalse(standardInfinite1);
		
		boolean standardInfinite2 = CardLogoType.isValidCardHierarchy("Visa", "Standard", "Final Infinite 2");
		assertFalse(standardInfinite2);
		
		boolean standardInfinite3 = CardLogoType.isValidCardHierarchy("Visa", "Standard", "Final Infinite 3");
		assertFalse(standardInfinite3);
		
		// Invalid cardValue
		boolean visaRandom1 = CardLogoType.isValidCardHierarchy("Visa", "Infinite", "Final random 1");
		assertFalse(visaRandom1);
		
		// MASTERCARD
		// Invalid cardType
		boolean visaStandard1 = CardLogoType.isValidCardHierarchy("Visa", "Standard", "Final Standard 1");
		assertFalse(visaStandard1);
		
		boolean visaStandard2 = CardLogoType.isValidCardHierarchy("Visa", "Standard", "Final Standard 2");
		assertFalse(visaStandard2);

		boolean visaStandard3 = CardLogoType.isValidCardHierarchy("Visa", "Standard", "Final Standard 3");
		assertFalse(visaStandard3);
		
		// Invalid subCardType
		boolean infiniteStandard1 = CardLogoType.isValidCardHierarchy("Mastercard", "Infinite", "Final Standard 1");
		assertFalse(infiniteStandard1);
		
		boolean infiniteStandard2 = CardLogoType.isValidCardHierarchy("Mastercard", "Infinite", "Final Standard 2");
		assertFalse(infiniteStandard2);

		boolean infiniteStandard3 = CardLogoType.isValidCardHierarchy("Mastercard", "Infinite", "Final Standard 3");
		assertFalse(infiniteStandard3);
		
		// Invalid cardValue
		boolean mastercardRandom1 = CardLogoType.isValidCardHierarchy("Mastercard", "Standard", "Final random 1");
		assertFalse(mastercardRandom1);
    }
}