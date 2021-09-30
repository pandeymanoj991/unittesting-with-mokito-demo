package com.mk.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return"Hello world";
	}
	
	@PostMapping("/items")
	public Item saveItem() {
		service.saveItem();
	}

}
