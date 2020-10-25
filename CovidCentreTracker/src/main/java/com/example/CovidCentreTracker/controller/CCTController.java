package com.example.CovidCentreTracker.controller;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CovidCentreTracker.dto.CentreDTO;
import com.example.CovidCentreTracker.model.CentreModel;
import com.example.CovidCentreTracker.service.CCTService;

@RestController
public class CCTController {
	
	@Autowired
	CCTService service;
	
	@PostMapping("addCentre")
	public ResponseEntity<?> addCentre(@RequestBody CentreDTO centre)
	{
		ModelMapper mapper = new ModelMapper();
		CentreModel newCentre = mapper.map(centre, CentreModel.class);
		CentreModel addedCentre = service.addCentre(newCentre);
		if(addedCentre!=null)
		return new ResponseEntity<CentreModel>(addedCentre,HttpStatus.OK);
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
		ModelMapper mapper = new ModelMapper();
		CentreModel newCentre = mapper.map(centre, CentreModel.class);
		CentreModel updatedCentre = service.editCentre(newCentre);
		if(updatedCentre != null)
		{
			return new ResponseEntity<CentreModel>(updatedCentre,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Request for update centre failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("getAllCentre")
	public ResponseEntity<?> getAllCentre()
	{
		List<CentreModel> listOfCentre = service.listAllCentres();
		ModelMapper mapper = new ModelMapper();
		List<CentreDTO> listOfCentreToDto = mapper.map(listOfCentre, new TypeToken<List<CentreDTO>>(){}.getType());
		if(listOfCentreToDto!=null)
			return new ResponseEntity<List<CentreDTO>>(listOfCentreToDto,HttpStatus.OK);
		else
			return new ResponseEntity<String>("No centre found",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@PostMapping("approveCentre")
	public ResponseEntity<?> approveCentre(@RequestBody CentreDTO centre)
	{
		ModelMapper mapper = new ModelMapper();
		CentreModel newCentre =mapper.map(centre, CentreModel.class);
		boolean isApproved = service.approveCentre(newCentre);
		if(isApproved)
		{
			return new ResponseEntity<String>("Centre approved",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Centre not approved",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	

}
