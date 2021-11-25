package com.xworkz.java;

public class AirportAssociation {

	AirportDAO dao;

	public AirportAssociation(AirportDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(AirportDTO airportDTO) {
		System.out.println("save association method invoked");
		if (airportDTO != null) {
			boolean ref = dao.save(airportDTO);
			if (ref) {
				System.out.println("invoked save method in BusAssociation");
			} else {
				System.err.println("save method invalid");
			}
		} else {
			System.err.println("save method in association is invalid");
		}
	}

	public void findByName(AirportDTO airportDTO) {
		System.out.println("search association method invoked");
		if (airportDTO != null) {
			AirportDTO ref = dao.findByName(airportDTO.getName());
			if (ref != null) {
				System.out.println("invoked search method in association");
			} else {
				System.err.println("search method invalid");
			}
		} else {
			System.err.println("search method in association is invalid");
		}
	}

	public void displayAllDetails() {
		if (dao != null) {
			dao.displayAllDetails();
		}
	}
}
