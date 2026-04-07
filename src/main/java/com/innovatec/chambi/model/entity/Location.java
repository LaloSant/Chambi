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
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locations")
@Getter
@Setter
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Usuario user;

	@Column(length = 100)
	private String name;

	@Column(precision = 10) // ejemplo: 123.456789
	private Double latitude;

	@Column(precision = 10)
	private Double longitude;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private LocationType type;

	@Column(length = 20)
	private String streetline;

	@Column(length = 20)
	private String city;

	@Column(length = 20)
	private String state;

	@Column(length = 5)
	private String postalCode;

	public enum LocationType {
		HOUSE,
		APARTMENT,
		OFFICE,
		OTHERS
	}

}
