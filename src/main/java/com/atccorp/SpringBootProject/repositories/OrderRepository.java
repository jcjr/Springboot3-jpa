package com.atccorp.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atccorp.SpringBootProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
