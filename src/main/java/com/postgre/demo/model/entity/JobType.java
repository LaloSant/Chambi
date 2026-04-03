package com.postgre.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "job_type")
public class JobType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_type_id")
	@Getter
	@Setter
	private Long id;

	@Column(nullable = false, length = 50)
	@Getter
	@Setter
	private String name;

	@Column(nullable = false, length = 150)
	@Getter
	@Setter
	private String description;

}
