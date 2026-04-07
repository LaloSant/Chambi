package com.innovatec.chambi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovatec.chambi.model.entity.Location;
import com.innovatec.chambi.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;

	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	public Optional<Location> getLocation(Long id) {
		return locationRepository.findById(id);
	}
}
