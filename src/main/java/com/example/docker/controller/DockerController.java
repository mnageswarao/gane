package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/docker")
	public String display() {
		return "welcome msg";
	}
}
