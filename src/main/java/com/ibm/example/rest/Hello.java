package com.ibm.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, Stranger";
	}

	@PostMapping("/hello/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Hello, " + name;
	}
}
