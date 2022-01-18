package com.truemeds.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truemeds.assignment.model.RemoveSimilarCharacters;

@Repository
public interface RemoveSimilarCharacterRepository extends CrudRepository<RemoveSimilarCharacters, Integer>{
	    @Query(value = "SELECT input_string FROM input_details", nativeQuery = true)
	    public List<String> getAllString();
}
