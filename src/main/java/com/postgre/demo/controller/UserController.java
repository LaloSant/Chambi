package com.postgre.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.postgre.demo.model.entity.User;
import com.postgre.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
