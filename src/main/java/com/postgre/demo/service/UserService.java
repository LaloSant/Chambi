package com.postgre.demo.service;

import org.springframework.stereotype.Service;

import com.postgre.demo.model.entity.User;
import com.postgre.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
