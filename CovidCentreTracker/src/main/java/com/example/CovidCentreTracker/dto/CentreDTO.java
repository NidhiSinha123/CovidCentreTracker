package com.example.CovidCentreTracker.dto;

import java.math.BigInteger;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Lob;

import com.example.CovidCentreTracker.model.AddressModel;

public class CentreDTO {
	
	private Long centreId;

	private String name;
	
	private BigInteger phone;
	
	private AddressModel address;
	
	private String longitude;
	
	private String latitude;
	
    private byte[] image;

	private boolean isApproved;
	
	public CentreDTO()
	{
		
	}

	public CentreDTO(Long centreId, String name, BigInteger phone, AddressModel address, String longitude,
			String latitude, byte[] image, boolean isApproved) {
		super();
		this.centreId = centreId;
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

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
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
		CentreDTO other = (CentreDTO) obj;
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

	@Override
	public String toString() {
		return "CentreDTO [centreId=" + centreId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", image=" + Arrays.toString(image)
				+ ", isApproved=" + isApproved + "]";
	}
	
	
	

}
