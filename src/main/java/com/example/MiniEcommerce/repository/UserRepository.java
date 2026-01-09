package com.example.MiniEcommerce.repository;

import com.example.MiniEcommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
