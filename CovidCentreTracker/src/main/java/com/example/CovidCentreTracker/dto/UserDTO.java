package com.example.CovidCentreTracker.dto;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.CovidCentreTracker.model.CentreModel;

public class UserDTO {
	
private long id;
	
	private String name;
	
	private BigInteger phone;
	
	private String email;
	
	private String hospitalName;
	
	private CentreModel centre;
	
	private String password;
	
	public UserDTO()
	{
		
	}

	public UserDTO(long id, String name, BigInteger phone, String email, String hospitalName, CentreModel centre,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.hospitalName = hospitalName;
		this.centre = centre;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public CentreModel getCentre() {
		return centre;
	}

	public void setCentre(CentreModel centre) {
		this.centre = centre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", hospitalName="
				+ hospitalName + ", centre=" + centre + ", password=" + password + "]";
	}
	
	

}
