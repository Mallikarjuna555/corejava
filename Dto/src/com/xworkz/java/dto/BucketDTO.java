package com.xworkz.java.dto;

public class BucketDTO {

	private String colour;
	private String size;
	private float price;
	private float quantity;
	private float weight;
	private String company;
	
	public BucketDTO() {
		System.out.println("no argument constructor is invoked");
	}

	public BucketDTO(String colour, String size, float price, float quantity, float weight, String company) {
		super();
		this.colour = colour;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
