package com.xworkz.java;

public class BirdAssociation {

	BirdDAO dao;
	
	

	public BirdAssociation(BirdDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(BirdDTO birdDTO) {
		System.out.println("save association method invoked");
		if (birdDTO != null) {
			boolean ref = dao.save(birdDTO);
			if (ref) {
				System.out.println("invoked save method in BirdAssociation");
			} else {
				System.err.println("save method invalid");
			}
		} else {
			System.err.println("save method in association is invalid");
		}
	}

	public void findByOrigin(BirdDTO birdDTO) {
		System.out.println("search association method invoked");
		if (birdDTO != null) {
			BirdDTO ref = dao.findByOrigin(birdDTO.getOrigin());
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
