package com.truemeds.assignment.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truemeds.assignment.model.RemoveSimilarCharacters;
import com.truemeds.assignment.serviceImpl.RemoveSimilarCharactersService;

@RestController
public class RemoveSimilarCharactersRest {
	private static final Logger logger = LogManager.getLogger(RemoveSimilarCharactersRest.class);
	@Autowired
	private RemoveSimilarCharactersService removeSimilarCharactersService;
	@PostMapping(path = "/create")
	RemoveSimilarCharacters createdata(@RequestBody RemoveSimilarCharacters removeSimilarCharactor) {
		logger.info("Inside Method createdata Rest");
		return removeSimilarCharactersService.createData(removeSimilarCharactor);
	}
}
