package com.innovatec.chambi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "professions_users")
@Getter
@Setter
public class ProfessionUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prof_usr_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "prof_id", nullable = false)
	private Profession profession;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Usuario user;
}
