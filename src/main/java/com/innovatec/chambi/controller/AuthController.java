package com.innovatec.chambi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.innovatec.chambi.security.JwtUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authManager;

	@PostMapping("/login")
	public String login(@RequestBody LoginRequest request) {
		Authentication authentication = authManager.authenticate(
				new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
		return JwtUtil.generateToken(authentication.getName());
	}
}

@Getter
@Setter
@AllArgsConstructor
class LoginRequest {
	private String email;
	private String password;
}
