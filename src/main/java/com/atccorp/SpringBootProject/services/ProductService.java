package com.atccorp.SpringBootProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atccorp.SpringBootProject.entities.Product;
import com.atccorp.SpringBootProject.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		//Optional<product> obj = repository.findById(id);
		return repository.findById(id).get();//obj.get();
	}
}
