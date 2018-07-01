package com.infogain.controller;
import com.infogain.entities.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")

public class UserController {
    
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id)	{
		return userRepository.findById(id).get();
	}
	
	@DeleteMapping("/user/{id}")
	public Boolean deleteUser(@PathVariable Long id)
	{
	    userRepository.deleteById(id);
		return true;
	}
	
	@PutMapping("user")
	public User updateUser(User user)
	{
		return userRepository.save(user);
	}
	
	@PostMapping("users")
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
}
