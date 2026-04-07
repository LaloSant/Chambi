package com.innovatec.chambi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovatec.chambi.model.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
