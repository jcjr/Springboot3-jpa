package com.atccorp.SpringBootProject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atccorp.SpringBootProject.entities.Category;
import com.atccorp.SpringBootProject.services.CategoryService;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		//List<Category> list = service.findAll(); Exemplo com variável
		return ResponseEntity.ok().body(service.findAll());//list); Exemplo sem variável
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		//Category obj = service.findById(id); Exemplo com variável
		return ResponseEntity.ok().body(service.findById(id));//obj); Exemplo sem variável
	}
	

}
