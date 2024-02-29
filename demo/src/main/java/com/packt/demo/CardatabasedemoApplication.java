package com.packt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabasedemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(CardatabasedemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CardatabasedemoApplication.class, args);
		logger.info("Hello Spring Boot");
	}
}