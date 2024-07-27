package com.atccorp.SpringBootProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atccorp.SpringBootProject.entities.User;
import com.atccorp.SpringBootProject.repositories.UserRepository;
import com.atccorp.SpringBootProject.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		// Exemplo com variável
		/*
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); //*/
		
		// Exemplo sem variável
		//*
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id)); //*/
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		
		// Exemplo com a variável "entity"
		/*
		User entity = repository.getReferenceById(id);
		update(entity, obj);
		return repository.save(entity);//*/
		
		// Exemplo sem variável "entity"
		//*
		update(repository.getReferenceById(id), obj);
		return repository.save(repository.getReferenceById(id));//*/
	}

	private void update(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		entity.setName(obj.getName());
	}
	
	
}
