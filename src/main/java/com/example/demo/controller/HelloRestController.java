package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @RestController:descibes the rest controller class.
 * @RequestMapping:describes the URL.
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello From BridgeLabz";
	}

}