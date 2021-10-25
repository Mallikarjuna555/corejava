package com.xworkz.java.dto;

public class ArmyDTO {

	private String country;
	private int noOfSoldiers;
	private int noOfCarriers;
	private int NoOfTankers;
	private String major;
	
	public ArmyDTO() {                                      //create,read
		System.out.println("no argument constructor");
	}

	public ArmyDTO(String country, int noOfSoldiers, int noOfCarriers, int noOfTankers, String major) {
		super();
		this.country = country;
		this.noOfSoldiers = noOfSoldiers;
		this.noOfCarriers = noOfCarriers;
		NoOfTankers = noOfTankers;
		this.major = major;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

	public int getNoOfCarriers() {
		return noOfCarriers;
	}

	public void setNoOfCarriers(int noOfCarriers) {
		this.noOfCarriers = noOfCarriers;
	}

	public int getNoOfTankers() {
		return NoOfTankers;
	}

	public void setNoOfTankers(int noOfTankers) {
		NoOfTankers = noOfTankers;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
