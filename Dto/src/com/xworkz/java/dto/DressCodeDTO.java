package com.xworkz.java.dto;

public class DressCodeDTO {

	private char size;
	private String material;
	private String colour;
	private float price;
	private boolean male;
	
	public DressCodeDTO() {
		System.out.println("no arguments constructor is invoked");
	}

	public DressCodeDTO(char size, String material, String colour, float price, boolean male) {
		super();
		this.size = size;
		this.material = material;
		this.colour = colour;
		this.price = price;
		this.male = male;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isGender() {
		return male;
	}

	public void setGender(boolean gender) {
		this.male = male;
	}
	
	
}
