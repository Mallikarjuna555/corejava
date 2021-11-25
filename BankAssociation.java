package com.xworkz.java;

public class BankAssociation {

	BankDAO dao;

	public BankAssociation(BankDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(BankDTO bankDTO) {
		System.out.println("save association method invoked");
		if (bankDTO != null) {
			boolean ref = dao.save(bankDTO);
			if (ref) {
				System.out.println("invoked save method in BusAssociation");
			} else {
				System.err.println("save method invalid");
			}
		} else {
			System.err.println("save method in association is invalid");
		}
	}

	public void findByName(BankDTO bankDTO) {
		System.out.println("search association method invoked");
		if (bankDTO != null) {
			BankDTO ref = dao.findByName(bankDTO.getName());
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
