package com.example.CovidCentreTracker.service;

import java.util.List;

import com.example.CovidCentreTracker.dto.CentreDTO;

public interface CCTService {
	
	CentreDTO addCentre(CentreDTO centre);
	boolean deleteCentre(long centreId);
	CentreDTO editCentre(CentreDTO centre);
	List<CentreDTO> listAllCentres();
	boolean approveCentre(CentreDTO centre);

}
