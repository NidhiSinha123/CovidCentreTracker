package com.example.CovidCentreTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CovidCentreTracker.model.CentreModel;

@Repository
public interface CentreRepository extends JpaRepository<CentreModel, Long>{

}
