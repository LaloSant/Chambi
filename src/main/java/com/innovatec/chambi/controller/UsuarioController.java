package com.innovatec.chambi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.innovatec.chambi.model.entity.Usuario;
import com.innovatec.chambi.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsuarioController {

	@Autowired
	private UsuarioService userService;

	@GetMapping
	public List<Usuario> getUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{idUser}")
	public Usuario getUser(@PathVariable Long idUser) {
		Optional<Usuario> usrOpti = userService.getUser(idUser);
		if (!usrOpti.isPresent()) {
			return null;
		}
		return usrOpti.get();
	}

	@PostMapping
	public void createUser(@RequestBody Usuario user) {
		if (user.getLocations() != null) {
			user.getLocations().forEach(loc -> loc.setUser(user));
		}
		userService.saveUser(user);
	}

}
