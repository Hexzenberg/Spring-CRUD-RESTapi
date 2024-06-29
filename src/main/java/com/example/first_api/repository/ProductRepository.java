package com.example.first_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.first_api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
