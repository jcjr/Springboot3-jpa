package com.atccorp.SpringBootProject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atccorp.SpringBootProject.entities.Product;
import com.atccorp.SpringBootProject.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		//List<Product> list = service.findAll(); Exemplo com variável
		return ResponseEntity.ok().body(service.findAll());//list); Exemplo sem variável
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		//Product obj = service.findById(id); Exemplo com variável
		return ResponseEntity.ok().body(service.findById(id));//obj); Exemplo sem variável
	}
	

}
