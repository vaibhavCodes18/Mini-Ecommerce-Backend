package com.example.MiniEcommerce.service;

import com.example.MiniEcommerce.dto.UserRequestDto;
import com.example.MiniEcommerce.dto.UserResponseDto;

public interface UserService {
    UserResponseDto addUser(UserRequestDto userRequestDto);
}
