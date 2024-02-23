package com.shareurthoughts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shareurthoughts.dto.request.UserDto;
import com.shareurthoughts.dto.response.UserResponseDto;
import com.shareurthoughts.service.UserRegistrationService;

@RestController
@RequestMapping("/shareurthoughts")
public class RegistrationController {
	@Autowired
	UserRegistrationService registrationService;
	@PostMapping("/signUp")
public UserResponseDto signUp(@RequestBody UserDto userRequest) {
	return registrationService.signUp(userRequest);
	
	
}
}
