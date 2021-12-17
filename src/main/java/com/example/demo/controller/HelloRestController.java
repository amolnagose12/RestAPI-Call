package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.model.User;

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
	
	/**
	 * 
	 * @param name
	 *
	 */
	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + " From Bridgelabz";
	}
	
	/**
	 * @GetMapping: mapping HTTP GET requests onto specific handler methods
	 * @param name
	 *
	 */
	@GetMapping("/param/{name}")
	public String sayHelloPara(@PathVariable String name) {
		return "Hello " + name + " From Bridgelabz";
	}
	/**
	 * @PostMapping:handle the HTTP POST requests matched with given URL expression
	 * @RequestBody:
	 
	 */
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
	}
	
	/**
	 * @PutMapping: mapping HTTP PUT requests onto specific handler methods.
	 * @param firstName
	 * @param lastName
	 
	 */
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + " From bridgeLabz";
	}

}