package com.example.CovidCentreTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CovidCentreTracker.dto.AddressDTO;

public interface AddressRepository extends JpaRepository<AddressDTO, Long> {

}
