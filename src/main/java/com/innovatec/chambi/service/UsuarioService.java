package com.innovatec.chambi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.innovatec.chambi.model.entity.Usuario;
import com.innovatec.chambi.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UsuarioRepository userRepository;

	public List<Usuario> getAllUsers() {
		return userRepository.findAll();
	}

	public Usuario saveUser(Usuario user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	public Optional<Usuario> getUser(Long id) {
		return userRepository.findById(id);
	}

	public Optional<Usuario> getUser(String email) {
		return userRepository.findByEmail(email);
	}
}
