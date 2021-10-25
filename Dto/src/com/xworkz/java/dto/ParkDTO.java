package com.xworkz.java.dto;

public class ParkDTO {

	private String[] parkNames = new String[3];
	private String location;
	private int inAcres;
	private boolean plantation;
	private int noOfSittings;
	private int temp = 0;

	public ParkDTO() {
		System.out.println("no argument constructor is invoked");
	}

	public ParkDTO(String location, int inAcres, boolean plantation, int noOfSittings) {
		super();
		this.location = location;
		this.inAcres = inAcres;
		this.plantation = plantation;
		this.noOfSittings = noOfSittings;
	}

	public void parkNames(String name) {

		if (temp < this.parkNames.length) {
			this.parkNames[temp++] = name;
			System.err.println("create method invoked".concat(String.valueOf(temp)).concat("~").concat(name));
		} else {
			System.err.println("array is npt pointing to any memory location");
		}

	}

	public String[] getParkNames() {
		return this.parkNames;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getInAcres() {
		return inAcres;
	}

	public void setInAcres(int inAcres) {
		this.inAcres = inAcres;
	}

	public boolean isPlantation() {
		return plantation;
	}

	public void setPlantation(boolean plantation) {
		this.plantation = plantation;
	}

	public int getNoOfSittings() {
		return noOfSittings;
	}

	public void setNoOfSittings(int noOfSittings) {
		this.noOfSittings = noOfSittings;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}
