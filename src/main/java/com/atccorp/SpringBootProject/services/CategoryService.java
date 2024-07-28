package com.atccorp.SpringBootProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.atccorp.SpringBootProject.entities.Category;
import com.atccorp.SpringBootProject.repositories.CategoryRepository;
import com.atccorp.SpringBootProject.services.exceptions.DatabaseException;
import com.atccorp.SpringBootProject.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		return repository.findById(id).get();
	}
	
	public Category insert(Category obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Category update(Long id, Category obj) {
		
		try {
			update(repository.getReferenceById(id), obj);
			return repository.save(repository.getReferenceById(id));
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void update(Category entity, Category obj) {
		entity.setName(obj.getName());
	}
}
