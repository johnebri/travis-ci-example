package com.johnebri.traviscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public String welcome() {
		return "Welcome to CI/CD";
	}

}
