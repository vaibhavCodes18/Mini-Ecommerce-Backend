package com.example.MiniEcommerce.service;

import com.example.MiniEcommerce.dto.ProductRequestDto;
import com.example.MiniEcommerce.dto.ProductResponseDto;
import com.example.MiniEcommerce.entity.Product;
import com.example.MiniEcommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setProductName(productRequestDto.getProductName());
        product.setPrice(productRequestDto.getPrice());

        Product savedProduct = productRepository.save(product);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setProductId(savedProduct.getId());
        productResponseDto.setProductName(savedProduct.getProductName());
        productResponseDto.setPrice(savedProduct.getPrice());

        return productResponseDto;
    }
}
