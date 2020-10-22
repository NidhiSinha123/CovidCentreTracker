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
	
	@Column(name="user_password")
	private String password;
	
	public UserDTO()
	{
		
	}

	

	public UserDTO(long id, String name, BigInteger phone, String email, String hospitalName, CentreDTO centre,
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

	public CentreDTO getCentre() {
		return centre;
	}

	public void setCentre(CentreDTO centre) {
		this.centre = centre;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centre == null) ? 0 : centre.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		if (centre == null) {
			if (other.centre != null)
				return false;
		} else if (!centre.equals(other.centre))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", hospitalName="
				+ hospitalName + ", centre=" + centre + ", password=" + password + "]";
	}

	
	
}
