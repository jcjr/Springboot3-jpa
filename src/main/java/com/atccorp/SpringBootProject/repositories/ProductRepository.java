package com.atccorp.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atccorp.SpringBootProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
