package com.example.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CardLogoType {

    String getValue();
    String getParent();

    static boolean isValidCardHierarchy(String cardType, String subCardType, String cardValue) {
    	List<CardType> cardTypes = List.of(CardType.values());
        
        List<CardLogoType> visaCardTypes = List.of(VisaCardType.values());
        List<CardLogoType> masterCardTypes = List.of(MasterCardType.values());
       
    	List<CardLogoType> infiniteCardTypes = List.of(InfiniteCardType.values());
        List<CardLogoType> standardCardTypes = List.of(StandardCardType.values());
        
        Optional<CardType> filteredCardType = null;
        Optional<CardLogoType> filteredSubCardType = null;
        Optional<CardLogoType> filteredCardValue = null;
        
        boolean isValid = false;
        
        // Retrieve card type
		filteredCardType = Stream.of(cardTypes)
		        .flatMap(List::stream)
		        .filter(card -> card.getValue().equals(cardType))
		        .findFirst();
		// Retrieve sub card type
		filteredSubCardType = Stream.of(visaCardTypes, masterCardTypes)
		        .flatMap(List::stream)
		        .filter(card -> card.getValue().equals(subCardType) &&
		        				card.getParent().equals(cardType))
		        .findFirst();
		// Retrieve final card value
		filteredCardValue = Stream.of(infiniteCardTypes, standardCardTypes)
			                .flatMap(List::stream)
			                .filter(card -> card.getValue().equals(cardValue) && 
			                				card.getParent().equals(subCardType))
			                .findFirst();

        if(filteredCardValue.isPresent() && filteredSubCardType.isPresent() && filteredCardType.isPresent()) {
        	isValid = true;
        }
        return isValid;
    }

}