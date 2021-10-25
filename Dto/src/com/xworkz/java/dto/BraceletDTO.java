package com.xworkz.java.dto;

public class BraceletDTO {

	private String colour;
	private String material;
	private float price;
	private boolean gemUsed;
	private boolean gifted;

	public BraceletDTO() {
		System.out.println("no arg constructor is inoked");
	}

	public BraceletDTO(String colour, String material, float price, boolean gemUsed, boolean gifted) {
		super();
		this.colour = colour;
		this.material = material;
		this.price = price;
		this.gemUsed = gemUsed;
		this.gifted = gifted;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

}
