package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class crudBackendApplication implements CommandLineRunner {
	

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(crudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		userRepository.save(new User("one","one"));

		userRepository.save(new User("two","two"));
		

		userRepository.save(new User("three","three"));
	}
}
