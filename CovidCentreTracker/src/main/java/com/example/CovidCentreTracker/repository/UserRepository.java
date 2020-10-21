package com.example.CovidCentreTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CovidCentreTracker.dto.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Long> {

}
