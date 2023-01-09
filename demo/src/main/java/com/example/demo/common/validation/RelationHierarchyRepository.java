package com.example.demo.common.validation;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.common.enums.RelationHierarchy;

@Repository
public interface RelationHierarchyRepository extends MongoRepository<RelationHierarchy, String> {
	
	@Query("{\"_id\": ?0}")
	public Optional<RelationHierarchy> findById(String id);
	
}
