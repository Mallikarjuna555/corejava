package com.xworkz.java.dto;

public class CameraDTO {

	private String company;
	private String type;
	private int pixel;
	private float cost;
	private float batteryCapacity;
	private float weight;
	
	public CameraDTO() {
		System.out.println("no argument constructor");
	}

	public CameraDTO(String company, String type, int pixel, float cost, float batteryCapacity, float weight) {
		super();
		this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.cost = cost;
		this.batteryCapacity = batteryCapacity;
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(float batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
}
