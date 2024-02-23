package com.shareurthoughts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.shareurthoughts.dto.request.UserDto;
import com.shareurthoughts.dto.response.UserResponseDto;
import com.shareurthoughts.model.User;
import com.shareurthoughts.repositories.UserRepository;
import com.shareurthoughts.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	UserRepository userRepository;
	@Value("${spring.security.user.name}")
	private String userName;

	@Value("${spring.security.user.password}")
	private String password;

	@Override
	public UserResponseDto login(UserDto userRequest) {

		UserResponseDto userResponseDto = new UserResponseDto();
		if (userRequest.getEmailId().equals(userName) && userRequest.getPassword().equals(password)) {
			User userResponse = userRepository.findByEmailId(userRequest.getEmailId());

			userResponseDto.setFirstName(userResponse.getFirstName());
			userResponseDto.setLastName(userResponse.getLastName());
			userResponseDto.setEmailId(userResponse.getEmailId());
			userResponseDto.setPhoneNumber(userResponse.getPhoneNumber());
		}
		return userResponseDto;
	}
}
