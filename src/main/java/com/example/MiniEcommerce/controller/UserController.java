package com.example.MiniEcommerce.controller;

import com.example.MiniEcommerce.dto.UserRequestDto;
import com.example.MiniEcommerce.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(@Valid @RequestBody UserRequestDto userRequestDto){
        return new ResponseEntity<>();
    }
}
