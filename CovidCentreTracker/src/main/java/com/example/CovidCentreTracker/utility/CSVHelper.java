package com.example.CovidCentreTracker.utility;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;

import com.example.CovidCentreTracker.model.AddressModel;
import com.example.CovidCentreTracker.model.CentreModel;

public class CSVHelper {

	 public static String TYPE = "text/csv";
	  static String[] HEADERs = {  "name", "phone", "line1","line2","city","state","pincode","longitude","latitude","image","isApproved" };

	  public static boolean hasCSVFormat(MultipartFile file) {
	    if (TYPE.equals(file.getContentType())
	    		|| file.getContentType().equals("application/vnd.ms-excel")) {
	      return true;
	    }

	    return false;
	  }

	  public static List<CentreModel> csvToCentres(InputStream is) {
	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        CSVParser csvParser = new CSVParser(fileReader,
	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

	      List<CentreModel> centrelList = new ArrayList<>();

	      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

	      for (CSVRecord csvRecord : csvRecords) {
	    	  CentreModel centre = new CentreModel(
	        
	              csvRecord.get("name"),
	              new BigInteger(csvRecord.get("phone")),
	              new AddressModel(csvRecord.get("line1"),csvRecord.get("line2"),csvRecord.get("city"),csvRecord.get("state"),Long.parseLong(csvRecord.get("pincode"))),
	              csvRecord.get("longitude"),
	              csvRecord.get("latitude"),
	              csvRecord.get("image").getBytes(),
	              Boolean.parseBoolean(csvRecord.get("isApproved"))
	            );

	    	  centrelList.add(centre);
	      }

	      return centrelList;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
	    }
	  }

	  public static ByteArrayInputStream CentresToCSV(List<CentreModel> centreList) {
	    final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

	    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
	      for (CentreModel centre : centreList) {
	        List<String> data = Arrays.asList(
	              String.valueOf(centre.getCentreId()),
	              String.valueOf(centre.getPhone()),
	              centre.getName(),
	              centre.getLongitude(),
	              centre.getLatitude(),
	              String.valueOf(centre.getImage()),
	              centre.getAddress().getLine1(),
	              centre.getAddress().getLine2(),
	              centre.getAddress().getCity(),
	              centre.getAddress().getState(),
	              String.valueOf(centre.getAddress().getPincode()),
	              String.valueOf(centre.isApproved())
	            );

	        csvPrinter.printRecord(data);
	      }

	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	  }
}
