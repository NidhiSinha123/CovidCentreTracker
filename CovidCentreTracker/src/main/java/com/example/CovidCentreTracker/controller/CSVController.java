package com.example.CovidCentreTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.CovidCentreTracker.service.CCTServiceImpl;


@RestController
@RequestMapping("/api/csv")
public class CSVController {

	
	@Autowired
	CCTServiceImpl service;

	
	
}
