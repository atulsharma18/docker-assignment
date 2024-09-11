package com.nagarro.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Dockerize Spring Boot Application.......";
	}

}
