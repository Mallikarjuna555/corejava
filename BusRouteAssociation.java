package com.xworkz.java;

public class BusRouteAssociation {

	BusRouteDAO dao;

	public BusRouteAssociation(BusRouteDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(BusRouteDTO busDTO) {
		System.out.println("save association method invoked");
		if (busDTO != null) {
			boolean ref = dao.save(busDTO);
			if (ref) {
				System.out.println("invoked save method in BusAssociation");
			} else {
				System.err.println("save method invalid");
			}
		} else {
			System.err.println("save method in association is invalid");
		}
	}

	public void findByName(BusRouteDTO busDTO) {
		System.out.println("search association method invoked");
		if (busDTO != null) {
			BusRouteDTO ref = dao.findByName(busDTO.getDriverName());
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
