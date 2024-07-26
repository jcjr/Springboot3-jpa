package com.atccorp.SpringBootProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atccorp.SpringBootProject.entities.Category;
import com.atccorp.SpringBootProject.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		//Optional<Category> obj = repository.findById(id);
		return repository.findById(id).get();//obj.get();
	}
}
