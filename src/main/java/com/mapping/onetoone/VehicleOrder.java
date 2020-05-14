package com.mapping.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_ORDER")
public class VehicleOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORID")
	private long Id;
	
	@Column(name="TEST_CENTRE")
	private String test_Centre;
	
	@Column(name="ORDER_STATUS")
	private String Order_Status;
	
	@Column(name="CAPACITY")
	private long capacity;

	
	public long getOrder_Id() {
		return Id;
	}

	public void setOrder_Id(long order_Id) {
		Id = order_Id;
	}

	public String getTest_Centre() {
		return test_Centre;
	}

	public void setTest_Centre(String test_Centre) {
		this.test_Centre = test_Centre;
	}

	public String getOrder_Status() {
		return Order_Status;
	}

	public void setOrder_Status(String order_Status) {
		Order_Status = order_Status;
	}
	
	public VehicleOrder()
	{
		
	}

	public long getCapacity() {
		return capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Order [Order_Id=" + Id + ", test_Centre=" + test_Centre + ", Order_Status=" + Order_Status
				+ ", capacity=" + capacity + "]";
	}
	
}
