package com.example.MiniEcommerce.service;

import com.example.MiniEcommerce.dto.PlaceOrderRequestDto;
import com.example.MiniEcommerce.dto.PlaceOrderResponseDto;

public interface OrderService {
    PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto);
}
