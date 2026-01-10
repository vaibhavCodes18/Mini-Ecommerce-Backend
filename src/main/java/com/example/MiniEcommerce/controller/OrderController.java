package com.example.MiniEcommerce.controller;

import com.example.MiniEcommerce.dto.PlaceOrderRequestDto;
import com.example.MiniEcommerce.response.ApiResponse;
import com.example.MiniEcommerce.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping
    public ResponseEntity<?> placeOrder(@Valid @RequestBody PlaceOrderRequestDto placeOrderRequestDto){
        return new ResponseEntity<>(new ApiResponse<>(201, "Order placed!", orderService.placeOrder(placeOrderRequestDto)), HttpStatus.CREATED);
    }
}
