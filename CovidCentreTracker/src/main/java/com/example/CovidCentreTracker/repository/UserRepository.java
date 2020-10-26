package com.example.CovidCentreTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CovidCentreTracker.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
