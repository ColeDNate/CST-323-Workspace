package com.gcu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudApplication11Application {

	public static void main(String[] args) {
		
		//logger
		Logger logger = LoggerFactory.getLogger(CloudApplication11Application.class);
		
		SpringApplication.run(CloudApplication11Application.class, args);
		
		//more logger
		logger.info("This is default log from Cloud App");
	}

}
