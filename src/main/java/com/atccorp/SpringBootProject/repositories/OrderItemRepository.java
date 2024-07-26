package com.atccorp.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atccorp.SpringBootProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
