package com.shareurthoughts.service;

import com.shareurthoughts.dto.request.UserDto;
import com.shareurthoughts.dto.response.UserResponseDto;

public interface LoginService {
	
	UserResponseDto login(UserDto userRequest);

}
