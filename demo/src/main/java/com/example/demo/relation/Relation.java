package com.example.demo.relation;

import com.example.demo.relation.enums.RelationCategory;
import com.example.demo.relation.enums.RelationSubCategory;

//import java.util.HashMap;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//import com.example.demo.relation.enums.FamilyExtendedRelation;
//import com.example.demo.relation.enums.FamilyImmediateRelation;
//import com.example.demo.relation.enums.FamilySubCategory;
//import com.example.demo.relation.enums.ProfessionalPersonalRelation;
//import com.example.demo.relation.enums.ProfessionalSubCategory;
//import com.example.demo.relation.enums.ProfessionalWorkRelation;
//import com.example.demo.relation.enums.RelationCategory;

public interface Relation {
	
	enum HashMapKey {
		RELATION,
		IS_VALID_RELATION,
	}
	
	public static final Relation category = null;
	public static final Relation subCategory = null;
	public static final Relation finalRelation = null;

    String getValue();
    RelationCategory getParent(RelationSubCategory sub);
    RelationCategory getCategoryByValue(String sub);

//    static boolean isValidRelationHierarchy(String relationCategory, String relationSubCategory, String relation) {
//    	// Implementation version 1
//    	List<Relation> relationTypes = List.of(RelationCategory.values());
//        
//        List<Relation> familyTypes = List.of(FamilySubCategory.values());
//        List<Relation> professionalTypes = List.of(ProfessionalSubCategory.values());
//       
//        List<Relation> familyImmediateTypes = List.of(FamilyImmediateRelation.values());
//    	List<Relation> professionalWorkTypes = List.of(ProfessionalWorkRelation.values());
//        
//        Optional<Relation> filteredRelationType = null;
//        Optional<Relation> filteredRelationSubType = null;
//        Optional<Relation> filteredRelation = null;
//        
//        boolean isValidHierarchy = false;
//        
//        // Retrieve relation type
//		filteredRelationType = Stream.of(relationTypes)
//		        .flatMap(List::stream)
//		        .filter(type -> type.getValue().equals(relationCategory))
//		        .findFirst();
//		// Retrieve sub relation type
//		filteredRelationSubType = Stream.of(professionalTypes, familyTypes)
//		        .flatMap(List::stream)
//		        .filter(type -> type.getValue().equals(relationSubCategory) &&
//		        				type.getParent().equals(relationCategory))
//		        .findFirst();
//		// Retrieve relation value 
//		filteredRelation = Stream.of(professionalWorkTypes, familyImmediateTypes)
//                .flatMap(List::stream)
//                .filter(type -> type.getValue().equals(relation) && 
//                				type.getParent().equals(relationSubCategory))
//                .findFirst();
//
//        if(filteredRelation.isPresent() && filteredRelationSubType.isPresent() && filteredRelationType.isPresent()) {
//        	isValidHierarchy = true;
//        }
    	
    	// Implementation Version 2
        // Relation Category
//        Relation relationCategoryEnum = RelationCategory.valueOf(relationCategory);
//        
//        // Relation Sub Category
//        Relation familySubCategoryEnum = FamilySubCategory.valueOf(relationSubCategory);
//        Relation professionalSubCategoryEnum = ProfessionalSubCategory.valueOf(relationSubCategory);
//        
//        // Relation
//        // -- Family
//        Relation familyImmediateRelationEnum = FamilyImmediateRelation.valueOf(relation);
//        Relation familyExtendedRelationEnum = FamilyExtendedRelation.valueOf(relation);
//        // -- Professional
//        Relation professionalPersonalRelationEnum = ProfessionalPersonalRelation.valueOf(relation);
//        Relation professionalWorkRelationEnum = ProfessionalWorkRelation.valueOf(relation);
//        
//        HashMap<HashMapKey, Object> relationCategoryHashMap = getEnumDetails(relationCategoryEnum);
//        HashMap<HashMapKey, Object> relationSubCategoryHashMap = getEnumDetails(familySubCategoryEnum, 
//				   																professionalSubCategoryEnum);
//        HashMap<HashMapKey, Object> relationHashMap = getEnumDetails(familyImmediateRelationEnum, 
//																	 familyExtendedRelationEnum,
//																	 professionalPersonalRelationEnum,
//																	 professionalWorkRelationEnum);
//        
//        boolean relationCategoryIsValidEnum = (boolean) relationCategoryHashMap.get(HashMapKey.IS_VALID_RELATION);
//        boolean relationSubCategoryIsValidEnum = (boolean) relationSubCategoryHashMap.get(HashMapKey.IS_VALID_RELATION);
//        boolean relationIsValidEnum = (boolean) relationHashMap.get(HashMapKey.IS_VALID_RELATION);
//
//        boolean isValidEnum = relationCategoryIsValidEnum && 
//        					  relationSubCategoryIsValidEnum && 
//        					  relationIsValidEnum;
//        boolean isValidHierarchy = false;
//        
//        if(isValidEnum) {
//        	Relation relationSubCategoryEnum = (Relation) relationSubCategoryHashMap.get(HashMapKey.RELATION);
//        	Relation relationEnum = (Relation) relationHashMap.get(HashMapKey.RELATION);
//
//        	boolean relationCategoryIsValidHierarchy = relationCategoryEnum.equals(relationSubCategoryEnum);
//        	boolean relationSubCategoryIsValidHierarchy = relationSubCategoryEnum.equals(relationEnum);
//        	
//        	if(relationCategoryIsValidHierarchy && relationSubCategoryIsValidHierarchy) {
//        		isValidHierarchy = true;
//        	}
//        } 
//
//		return isValidHierarchy;
//    }
//    
//    static HashMap<HashMapKey, Object> getEnumDetails(Relation... relations) {
//    	// Try to retrieve relation enum
//    	Optional<Relation> relation = Stream.of(relations).filter(relationElement -> relationElement != null).findFirst();
//    	
//    	HashMap<HashMapKey, Object> enumDetailsHashMap = new HashMap<>();
//    	if(relation.isPresent()) {
//    		enumDetailsHashMap.put(HashMapKey.RELATION, relation.get());
//    		enumDetailsHashMap.put(HashMapKey.IS_VALID_RELATION, true);
//    	} else {
//    		enumDetailsHashMap.put(HashMapKey.IS_VALID_RELATION, false);
//    	}
//    	
//    	return enumDetailsHashMap;
//    }
    
}