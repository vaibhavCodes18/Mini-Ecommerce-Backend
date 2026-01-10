package com.example.MiniEcommerce.repository;

import com.example.MiniEcommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
