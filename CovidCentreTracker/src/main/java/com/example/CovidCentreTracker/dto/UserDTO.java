package com.example.CovidCentreTracker.dto;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_phone_no")
	private BigInteger phone;
	
	@Column(name="user_email_id")
	private String email;
	
	@Column(name="user_hospital_name")
	private String hospitalName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "centre_id", referencedColumnName = "centre_id")
	private CentreDTO centre;
	
	public UserDTO()
	{
		
	}

	public UserDTO(long id, String name, BigInteger phone, String email, String hospitalName, CentreDTO centre) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.hospitalName = hospitalName;
		this.centre = centre;
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

	public CentreDTO getCentre() {
		return centre;
	}

	public void setCentre(CentreDTO centre) {
		this.centre = centre;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", hospitalName="
				+ hospitalName + ", centre=" + centre + "]";
	}
	
	
	
	
}
