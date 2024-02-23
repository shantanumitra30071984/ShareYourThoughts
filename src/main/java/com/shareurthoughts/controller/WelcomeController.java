package com.shareurthoughts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shareurthoughts.dto.request.UserDto;

@RestController
@RequestMapping("/shareurthoughts")
public class WelcomeController {
	@PostMapping("/welcome")
	public String  welcome(@RequestBody UserDto userRequest) {
		return "Welcome";
		
	}
	
	@GetMapping("/home")
	public String  home(@RequestParam("userName")String  userName) {
		return "Welcome";
		
	}

}
