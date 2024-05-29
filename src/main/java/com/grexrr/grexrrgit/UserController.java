package com.grexrr.grexrrgit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grexrr.grexrrgit.model.User;
import com.grexrr.grexrrgit.repository.UserRepository;

@RestController
public class UserController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello, world!";
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
