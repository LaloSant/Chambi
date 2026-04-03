package com.postgre.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100)
	@Getter
	@Setter
	private String name;

	@Column(unique = true)
	@Getter
	@Setter
	private String email;

	@Getter
	@Setter
	private String password;

	@ManyToOne
	@JoinColumn(name = "prof_id")
	@Getter
	@Setter
	private Profession profession;
}
