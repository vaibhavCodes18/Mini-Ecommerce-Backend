package com.example.MiniEcommerce.service;

import com.example.MiniEcommerce.dto.ProductRequestDto;
import com.example.MiniEcommerce.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto addProduct(ProductRequestDto productRequestDto);
}
