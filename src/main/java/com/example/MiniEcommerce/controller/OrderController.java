package com.example.MiniEcommerce.controller;

import com.example.MiniEcommerce.dto.PlaceOrderRequestDto;
import com.example.MiniEcommerce.response.ApiResponse;
import com.example.MiniEcommerce.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping
    public ResponseEntity<?> placeOrder(@Valid @RequestBody PlaceOrderRequestDto placeOrderRequestDto){
        return new ResponseEntity<>(new ApiResponse<>(201, "Order placed!", orderService.placeOrder(placeOrderRequestDto)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOrderById(@PathVariable("id") Long id){
        return new ResponseEntity<>(new ApiResponse<>(200, "Order fetched", orderService.getOrderById(id)), HttpStatus.OK);
    }
}
