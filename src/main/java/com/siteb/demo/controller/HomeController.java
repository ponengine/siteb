package com.siteb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String msg() {
		
		return "Service B";
	}
}
