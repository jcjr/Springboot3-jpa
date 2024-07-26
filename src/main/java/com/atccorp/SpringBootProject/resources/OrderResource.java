package com.atccorp.SpringBootProject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atccorp.SpringBootProject.entities.Order;
import com.atccorp.SpringBootProject.services.OrderService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		//List<Order> list = service.findAll();  Exemplo com variável
		return ResponseEntity.ok().body(service.findAll());//list);  Exemplo sem variável
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		//Order obj = service.findById(id); Exemplo com variável
		return ResponseEntity.ok().body(service.findById(id));//obj);  Exemplo sem variável
	}
	

}
