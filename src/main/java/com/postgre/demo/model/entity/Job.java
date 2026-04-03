package com.postgre.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jobs")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	@Getter
	@Setter
	private Long id;

	@ManyToOne
	@JoinColumn(name = "contractor_id", nullable = true)
	@Getter
	@Setter
	private User contractor;

	@ManyToOne
	@JoinColumn(name = "worker_id", nullable = true)
	@Getter
	@Setter
	private User worker;

	@ManyToOne
	@JoinColumn(name = "job_type_id", nullable = false)
	@Getter
	@Setter
	private JobType jobType;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@Getter
	@Setter
	private JobStatus status;

	public enum JobStatus {
		PENDING,
		SOLVED,
		CANCELED,
		NOT_ASSIGNED
	}

}
