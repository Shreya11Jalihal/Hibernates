package com.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {

	@Id
	@Column(name="VEHICLE_ID")
	private long VID;
	
	@Column(name="VEHICLE_BRAND")
	private String brand;
	
	@Column(name="VEHICLE_COUNTRY")
	private String country;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ORDER_ID")
	private VehicleOrder vehicleOrder;
	
	@Column(name="VEHICLE_VOLUME")
	private long volume;

	public long getVID() {
		return VID;
	}

	public void setVID(long vID) {
		VID = vID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public VehicleOrder getOrder() {
		return vehicleOrder;
	}

	public void setOrder(VehicleOrder order) {
		this.vehicleOrder = order;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public Vehicle()
	{
		
	}
	
	@Override
	public String toString() {
		return "Vehicle [VID=" + VID + ", brand=" + brand + ", country=" + country + ", order=" + vehicleOrder + ", volume="
				+ volume + "]";
	}
	
	
	
	
	
	
	
}
