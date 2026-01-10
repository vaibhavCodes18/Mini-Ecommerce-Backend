package com.example.MiniEcommerce.repository;

import com.example.MiniEcommerce.entity.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
