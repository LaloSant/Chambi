package com.innovatec.chambi.model.entity;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jobs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "contractor_id", nullable = true)
	private Usuario contractor;

	@ManyToOne
	@JoinColumn(name = "worker_id", nullable = true)
	private Usuario worker;

	@ManyToOne
	@JoinColumn(name = "job_type_id", nullable = false)
	private JobType jobType;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private JobStatus status;

	public enum JobStatus {
		PENDING,
		SOLVED,
		CANCELED,
		NOT_ASSIGNED
	}

}
