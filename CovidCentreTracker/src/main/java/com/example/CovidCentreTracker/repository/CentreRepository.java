package com.example.CovidCentreTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CovidCentreTracker.dto.CentreDTO;

@Repository
public interface CentreRepository extends JpaRepository<CentreDTO, Long>{

}
