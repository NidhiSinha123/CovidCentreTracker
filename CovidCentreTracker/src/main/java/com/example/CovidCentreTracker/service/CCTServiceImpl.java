package com.example.CovidCentreTracker.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.CovidCentreTracker.dto.CentreDTO;
import com.example.CovidCentreTracker.model.CentreModel;
import com.example.CovidCentreTracker.repository.CentreRepository;

@Service
public class CCTServiceImpl implements CCTService {

	 @Autowired
	  CentreRepository centreRepository;

	@Override

	public boolean deleteCentre(long centreId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CentreModel editCentre(CentreModel centre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CentreModel> listAllCentres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveCentre(CentreModel centre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CentreModel addCentre(CentreDTO centre) {
		// TODO Auto-generated method stub
		return null;
	}

	 
}
