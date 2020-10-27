package com.example.CovidCentreTracker.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.CovidCentreTracker.dto.CentreDTO;
import com.example.CovidCentreTracker.model.CentreModel;
import com.example.CovidCentreTracker.repository.CentreRepository;
import com.example.CovidCentreTracker.utility.CSVHelper;

@Service
public class CCTServiceImpl implements CCTService {

	@Autowired
	CentreRepository centreRepository;

	@Override

	public boolean deleteCentre(long centreId) {
		// TODO Auto-generated method stub

		try {
			centreRepository.deleteById(centreId);
			// CentreModel centre = centreRepository.findById(centreId).get();
			if (centreRepository.existsById(centreId)) {
				return false;
			} else
				return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public CentreModel editCentre(CentreModel centre) {
		// TODO Auto-generated method stub
		CentreModel newCentre = centreRepository.findById(centre.getCentreId()).get();
		newCentre.setAddress(centre.getAddress());
		newCentre.setIsApproved(centre.getIsApproved());
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
		if (newCentre == null)
			return false;
		newCentre.setIsApproved(true);
		return true;
	}

	@Override
	public CentreModel addCentre(CentreModel newCentre) {
		// TODO Auto-generated method stub
		return centreRepository.save(newCentre);
	}
  
	public void save(MultipartFile file) {
	    try {
	      List<CentreModel> centres = CSVHelper.csvToCentres(file.getInputStream());
	      centreRepository.saveAll(centres);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }

	  public ByteArrayInputStream load() {
	    List<CentreModel> centres = centreRepository.findAll();

	    ByteArrayInputStream in = CSVHelper.CentresToCSV(centres);
	    return in;
	  }
}
