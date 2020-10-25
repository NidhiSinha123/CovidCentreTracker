package com.example.CovidCentreTracker.service;

import java.util.List;

import com.example.CovidCentreTracker.model.CentreModel;

public interface CCTService {
	
	CentreModel addCentre(CentreModel centre);
	boolean deleteCentre(long centreId);
	CentreModel editCentre(CentreModel centre);
	List<CentreModel> listAllCentres();
	boolean approveCentre(CentreModel centre);

}
