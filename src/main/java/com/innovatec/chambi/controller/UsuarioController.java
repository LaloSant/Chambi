package com.innovatec.chambi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.innovatec.chambi.model.entity.Usuario;
import com.innovatec.chambi.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

	@Autowired
	private UsuarioService userService;

	@GetMapping
	public List<Usuario> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping
	public Usuario createUser(@RequestBody Usuario user) {
		return userService.saveUser(user);
	}

}
