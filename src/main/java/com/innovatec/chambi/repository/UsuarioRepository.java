package com.innovatec.chambi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovatec.chambi.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findById(Long id);

	public Usuario findByName(String username);

	public Optional<Usuario> findByEmail(String email);
}
