package com.postgre.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgre.demo.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
}
