package com.example.MiniEcommerce.controller;

import com.example.MiniEcommerce.dto.ProductRequestDto;
import com.example.MiniEcommerce.response.ApiResponse;
import com.example.MiniEcommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@Valid @RequestBody ProductRequestDto productRequestDto){
        return new ResponseEntity<>(
                new ApiResponse<>(
                201,
                "Product added",
                productService.addProduct(productRequestDto)),
                HttpStatus.CREATED
        );
    }
}
