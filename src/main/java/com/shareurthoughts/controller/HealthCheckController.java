package com.shareurthoughts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/shareurthoughts")
@RestController
public class HealthCheckController {

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "Apllication is up and running";
	}
}
