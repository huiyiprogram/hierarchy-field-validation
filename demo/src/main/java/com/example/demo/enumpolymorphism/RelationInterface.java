package com.example.demo.enumpolymorphism;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// Each set of hierarchy should have 1 interface for implementation
public interface RelationInterface {

	RelationInterface getCategory();
	
	RelationInterface getSubCategory();
	
	String getValue();
	
	// Retrieve enum from Category's string value
	static Optional<RelationInterface> fromCategoryValue(String value) {
    	 List<RelationInterface> category = List.of(CategoryRelation.values());
    	
         return Stream.of(category)
                 .flatMap(List::stream)
                 .filter(cat -> cat.getValue().equals(value))
                 .findFirst();
    }
	
	// Retrieve enum from Sub Category's string value
	static Optional<RelationInterface> fromSubCategoryValue(String value) {
		List<RelationInterface> subCategoryFamily = List.of(SubCategoryFamily.values());
		List<RelationInterface> subCategoryProfessional = List.of(SubCategoryProfessional.values());
		
		return Stream.of(subCategoryFamily, subCategoryProfessional)
                 .flatMap(List::stream)
                 .filter(subCategory -> subCategory.getValue().equals(value))
                 .findFirst();
    }

	// Retrieve enum from Relation's string value
	static Optional<RelationInterface> fromRelationValue(String value) {
		List<RelationInterface> subCategoryFamily = List.of(SubCategoryFamily.values());
		List<RelationInterface> subCategoryProfessional = List.of(SubCategoryProfessional.values());
		
		return Stream.of(subCategoryFamily, subCategoryProfessional)
                 .flatMap(List::stream)
                 .filter(subCategory -> subCategory.getValue().equals(value))
                 .findFirst();
    }
    
}
