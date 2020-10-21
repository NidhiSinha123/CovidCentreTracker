package com.example.CovidCentreTracker.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.CovidCentreTracker.dto.CentreDTO;
import com.example.CovidCentreTracker.repository.CentreRepository;

@Service
public class CovidCentreTrackerService {

	 @Autowired
	  CentreRepository centreRepository;

	 
}
