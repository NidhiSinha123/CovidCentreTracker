package com.example.CovidCentreTracker.controller;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CovidCentreTracker.dto.CentreDTO;
import com.example.CovidCentreTracker.service.CCTService;

@RestController
public class CCTController {
	
	@Autowired
	CCTService service;
	
	@PostMapping("addCentre")
	public ResponseEntity<?> addCentre(@RequestBody CentreDTO centre)
	{
		CentreDTO addedCentre = service.addCentre(centre);
		if(addedCentre!=null)
		return new ResponseEntity<CentreDTO>(addedCentre,HttpStatus.OK);
		else
		return new ResponseEntity<String>("Request for adding centre failed",HttpStatus.INTERNAL_SERVER_ERROR);	
	
	}
	
	@DeleteMapping("deleteCentre")
	public ResponseEntity<?> deleteCentre(@RequestParam("centreId") Long centreId)
	{
		boolean isDeleted = service.deleteCentre(centreId);
		if(isDeleted)
		{
			return new ResponseEntity<String>("Centre deleted successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Request for deleted centre failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("updateCentre")
	public ResponseEntity<?> updateCentre(@RequestBody CentreDTO centre)
	{
		CentreDTO updatedCentre = service.editCentre(centre);
		if(updatedCentre != null)
		{
			return new ResponseEntity<CentreDTO>(updatedCentre,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Request for update centre failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
