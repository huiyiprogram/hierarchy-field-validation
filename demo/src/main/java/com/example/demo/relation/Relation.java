package com.example.demo.relation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.example.demo.relation.enums.FamilyImmediateRelation;
import com.example.demo.relation.enums.FamilySubCategory;
import com.example.demo.relation.enums.ProfessionalSubCategory;
import com.example.demo.relation.enums.ProfessionalWorkRelation;
import com.example.demo.relation.enums.RelationCategory;

public interface Relation {

	Optional<Relation> getEnum(String value);
    String getValue();
    String getParent();

    static boolean isValidRelationHierarchy(String relationCategory, String relationSubCategory, String relation) {
    	List<Relation> relationTypes = List.of(RelationCategory.values());
        
        List<Relation> familyTypes = List.of(FamilySubCategory.values());
        List<Relation> professionalTypes = List.of(ProfessionalSubCategory.values());
       
        List<Relation> familyImmediateTypes = List.of(FamilyImmediateRelation.values());
    	List<Relation> professionalWorkTypes = List.of(ProfessionalWorkRelation.values());
        
        Optional<Relation> filteredRelationType = null;
        Optional<Relation> filteredRelationSubType = null;
        Optional<Relation> filteredRelation = null;
        
        boolean isValid = false;
        
        // Retrieve relation type
		filteredRelationType = Stream.of(relationTypes)
		        .flatMap(List::stream)
		        .filter(type -> type.getValue().equals(relationCategory))
		        .findFirst();
		// Retrieve sub relation type
		filteredRelationSubType = Stream.of(professionalTypes, familyTypes)
		        .flatMap(List::stream)
		        .filter(type -> type.getValue().equals(relationSubCategory) &&
		        				type.getParent().equals(relationCategory))
		        .findFirst();
		// Retrieve relation value 
		filteredRelation = Stream.of(professionalWorkTypes, familyImmediateTypes)
                .flatMap(List::stream)
                .filter(type -> type.getValue().equals(relation) && 
                				type.getParent().equals(relationSubCategory))
                .findFirst();

        if(filteredRelation.isPresent() && filteredRelationSubType.isPresent() && filteredRelationType.isPresent()) {
        	isValid = true;
        }
        
        if(filteredRelation != null) {
        	isValid = true;
        }
        return isValid;
    }

}