package com.innovatec.chambi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovatec.chambi.model.entity.Location;
import com.innovatec.chambi.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping
	public List<Location> getUsers() {
		return locationService.getAllLocations();
	}

	@PostMapping
	public Location createUser(@RequestBody Location location) {
		return locationService.saveLocation(location);
	}

}
