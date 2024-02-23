package com.shareurthoughts.service;

import com.shareurthoughts.dto.request.UserDto;
import com.shareurthoughts.dto.response.UserResponseDto;

public interface UserRegistrationService {
	
	public UserResponseDto signUp(UserDto userRequest);

}
