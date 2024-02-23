package com.shareurthoughts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareurthoughts.dto.request.UserDto;
import com.shareurthoughts.dto.response.UserResponseDto;
import com.shareurthoughts.model.User;
import com.shareurthoughts.repositories.UserRepository;
import com.shareurthoughts.service.UserRegistrationService;
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponseDto signUp(UserDto userRequest) {
		User user = new User();
		user.setId(1L);
		user.setFirstName(userRequest.getFirstName());
		user.setLastName(userRequest.getLastName());
		user.setEmailId(userRequest.getEmailId());
		user.setPhoneNumber(userRequest.getPhoneNumber());
		User userResponse = userRepository.save(user);
		UserResponseDto userResponseDto = new UserResponseDto();
		userResponseDto.setFirstName(userResponse.getFirstName());
		userResponseDto.setLastName(userResponse.getLastName());
		userResponseDto.setEmailId(userResponse.getEmailId());
		userResponseDto.setPhoneNumber(userResponse.getPhoneNumber());
		return userResponseDto;
	}

}
