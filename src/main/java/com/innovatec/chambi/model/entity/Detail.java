package com.innovatec.chambi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "details_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "job_id", nullable = false)
	private Job job;

	@ManyToOne
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;

	@Column(nullable = false)
	private String value;
}
