package com.truemeds.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class AssignmentApplication {
	private static final Logger logger = LogManager.getLogger(AssignmentApplication.class);
	public static void main(String[] args) {
		logger.info("Application SuccessFully open");
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
