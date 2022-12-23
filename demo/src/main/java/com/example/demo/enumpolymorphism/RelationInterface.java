package com.example.demo.enumpolymorphism;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface RelationInterface {

	String getValue();

    CategoryRelation getCategoryRelation();

    static Optional<RelationInterface> fromValue(String value) {
        List<RelationInterface> familySubCategory = List.of(SubCategoryFamily.values());
        List<RelationInterface> professionalSubCategory = List.of(SubCategoryProfessional.values());
        
        return Stream.of(familySubCategory, professionalSubCategory)
                .flatMap(List::stream)
                .filter(card -> card.getValue().equals(value))
                .findFirst();
    }

    static Set<RelationInterface> fromCategoryRelation(CategoryRelation categoryRelation) {
        return Stream.of(List.of(SubCategoryFamily.values()), List.of(SubCategoryProfessional.values()))
                .flatMap(List::stream)
                .filter(subCategory -> subCategory.getCategoryRelation().equals(categoryRelation))
                .collect(Collectors.toSet());
    }
    
}
