package com.example.CovidCentreTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.example.CovidCentreTracker.service.CovidCentreTrackerService;

@CrossOrigin("http://localhost:9000")
@Controller
@RequestMapping("/api/csv")
public class CSVController {

	
	@Autowired
	CovidCentreTrackerService service;

	 
}
