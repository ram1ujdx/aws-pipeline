package com.ct.springboot.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Sir..";
	}
	
	@GetMapping("/hello")
	public String sayHelloWorld() {
		return "Hello World..";
	}
	
	
}
