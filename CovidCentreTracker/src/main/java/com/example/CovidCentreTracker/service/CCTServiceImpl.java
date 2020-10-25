package com.example.CovidCentreTracker.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
		centreRepository.deleteById(centreId);
		CentreModel centre = centreRepository.findById(centreId).get();
		if(centre==null)
			return true;
		else
			return false;
		
	}

	@Override
	public CentreModel editCentre(CentreModel centre) {
		// TODO Auto-generated method stub
		CentreModel newCentre = centreRepository.findById(centre.getCentreId()).get();
		newCentre.setAddress(centre.getAddress());
		newCentre.setApproved(centre.isApproved());
		newCentre.setImage(centre.getImage());
		newCentre.setLatitude(centre.getLatitude());
		newCentre.setLongitude(centre.getLongitude());
		newCentre.setName(centre.getName());
		newCentre.setPhone(centre.getPhone());
		return centreRepository.save(newCentre);
	}

	@Override
	public List<CentreModel> listAllCentres() {
		// TODO Auto-generated method stub
		List<CentreModel> listOfCentres = centreRepository.findAll();
		return listOfCentres;
	}

	@Override
	public boolean approveCentre(CentreModel centre) {
		// TODO Auto-generated method stub
		CentreModel newCentre = centreRepository.findById(centre.getCentreId()).get();
		if(newCentre==null)
			return false;
		newCentre.setApproved(true);
		return true;
	}

	@Override
	public CentreModel addCentre(CentreModel newCentre) {
		// TODO Auto-generated method stub
		return centreRepository.save(newCentre);
	}


	 
}
