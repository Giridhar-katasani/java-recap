package com.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Product;

public interface ProductRepositary extends JpaRepository<Product, Integer> {
	
}
