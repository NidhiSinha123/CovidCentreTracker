package com.example.CovidCentreTracker.service;
import java.io.ByteArrayInputStream;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.example.CovidCentreTracker.model.CentreModel;

public interface CCTService {
	
	CentreModel addCentre(CentreModel newCentre);
	boolean deleteCentre(long centreId);
	CentreModel editCentre(CentreModel centre);
	List<CentreModel> listAllCentres();
	boolean approveCentre(CentreModel centre);
    void save(MultipartFile file);
    ByteArrayInputStream load();

}
