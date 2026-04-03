package com.postgre.demo.model.entity;

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
@Table(name = "details")
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "details_id")
	@Getter
	@Setter
	private Long id;

	@ManyToOne
	@JoinColumn(name = "job_id", nullable = false)
	@Getter
	@Setter
	private Job job;

	@ManyToOne
	@JoinColumn(name = "question_id", nullable = false)
	@Getter
	@Setter
	private Question question;

	@Column(nullable = false)
	@Getter
	@Setter
	private String value;
}
