package com.postgre.demo.model.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "professions")
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prof_id")
	private Long id;

	@Column(length = 50)
	@Getter
	@Setter
	private String name;

	@Column(length = 150)
	@Getter
	@Setter
	private String description;

	@OneToMany(mappedBy = "profession", cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter
	@Setter
	private List<User> users;
}
