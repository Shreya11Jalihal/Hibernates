package com.onetoone.unidirectionalmapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private long Id;

	@Column(name = "CITY_NAME")
	private String cityName;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "PIN_CODE")
	private long pinCode;
	
	public Address()
	{
		
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	
	
	
	public Address(String cityName, String countryName, long pinCode) {
		super();
		this.cityName = cityName;
		this.countryName = countryName;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", countryName=" + countryName + ", pinCode=" + pinCode + "]";
	}

}
