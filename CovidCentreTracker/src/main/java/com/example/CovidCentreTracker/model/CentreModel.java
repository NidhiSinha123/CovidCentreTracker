package com.example.CovidCentreTracker.model;

import java.math.BigInteger;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity(name = "centre_table")
public class CentreModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "centre_id")
	private Long centreId;
	
	@Column(name="centre_name")
	private String name;
	
	@Column(name="centre_phone_no")
	private BigInteger phone;
	
	@Embedded
	@Column(name="centre_address")
	private AddressModel address;
	
	@Column(name="centre_longitude")
	private String longitude;
	
	@Column(name="centre_latitude")
	private String latitude;
	
	@Lob
    @Column(name="centre_image")
    private byte[] image;
	
	@Column(name="isApproved")
	private boolean isApproved;
	
	
	
	public CentreModel()
	{
		
	}



	public CentreModel( String name, BigInteger phone, AddressModel address, String longitude,
			String latitude, byte[] image, boolean isApproved) {
		super();
		
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
		this.image = image;
		this.isApproved = isApproved;
	}



	public Long getCentreId() {
		return centreId;
	}



	public void setCentreId(Long centreId) {
		this.centreId = centreId;
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



	public AddressModel getAddress() {
		return address;
	}



	public void setAddress(AddressModel address) {
		this.address = address;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] image) {
		this.image = image;
	}



	public boolean getIsApproved() {
		return isApproved;
	}



	public void setIsApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}



	@Override
	public String toString() {
		return "CentreDTO [centreId=" + centreId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", image=" + Arrays.toString(image)
				+ ", isApproved=" + isApproved + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((centreId == null) ? 0 : centreId.hashCode());
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + (isApproved ? 1231 : 1237);
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		CentreModel other = (CentreModel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (centreId == null) {
			if (other.centreId != null)
				return false;
		} else if (!centreId.equals(other.centreId))
			return false;
		if (!Arrays.equals(image, other.image))
			return false;
		if (isApproved != other.isApproved)
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	
	
	
}
