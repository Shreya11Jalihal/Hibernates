package com.mapping.onetoone;

public class Service {

	Vehicle vehicle = null;
	VehicleOrder order = new VehicleOrder();

	public Vehicle setValues(String[] splited) {
		vehicle = new Vehicle();
		vehicle.setVID(Long.parseLong(splited[0]));
		vehicle.setBrand(splited[1]);
		vehicle.setCountry(splited[2]);
		vehicle.setVolume(Long.parseLong(splited[3]));

		order.setTest_Centre(splited[4]);
		order.setOrder_Status(splited[5]);
		vehicle.setOrder(order);
		return vehicle;
	}

}
