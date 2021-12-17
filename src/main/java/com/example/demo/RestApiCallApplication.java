package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;


//@SpringBootApplication:describes the start of spring boot project.

@SpringBootApplication
public class RestApiCallApplication {

	public static void main(String[] args) {
		System.out.println("Hello from Bridgelabz");
		SpringApplication.run(RestApiCallApplication.class, args);
	}

}
