package com.xworkz.java;

public interface BusRouteDAO {

	boolean save(BusRouteDTO busDTO);

	BusRouteDTO findByName(String driverName);

	void displayAllDetails();
}
