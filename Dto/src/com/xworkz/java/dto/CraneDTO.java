package com.xworkz.java.dto;

public class CraneDTO {

	private String company;
	private String owner;
	private String[] driverNames = new String[5];
	private float weightInTon;
	private float price;
	private int temp = 0;

	public CraneDTO() {
		System.out.println("no argument constructor is invoked:");
	}
	//create
	public void driverNames(String names) {
		if (temp < this.driverNames.length) {
			this.driverNames[temp++] = names;
			System.out.println("create method invoked:".concat(names));
		} else {
			System.out.println("create method invoked:");
		}
	}

	public String[] getDriverNames() {
		return this.driverNames;
	}
	//delete
	public void delete(int index) {
		if (index < this.driverNames.length && this.driverNames.length >= 0) {
			this.driverNames[index] = null;
			System.out.println("delete method invoked:".concat(String.valueOf(index)));
		} else {
			System.out.println("delete method invoked:");
		}
	}
	//update
	public void update(int index, String name) {
		if (index < this.driverNames.length && this.driverNames.length >= 0) {
			this.driverNames[index] = name;
			System.out.println("update method invoked:".concat(String.valueOf(index).concat(" ")).concat(name));
		} else {
			System.out.println("update method invoked");
		}

	}

	// constructor
	public CraneDTO(String company, String owner, float weightInTon, float price) {
		super();
		this.company = company;
		this.owner = owner;
		this.weightInTon = weightInTon;
		this.price = price;
	}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public float getWeightInTon() {
		return weightInTon;
	}

	public void setWeightInTon(float weightInTon) {
		this.weightInTon = weightInTon;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
