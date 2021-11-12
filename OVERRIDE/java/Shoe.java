package com.xworkz.java;

public class Shoe {

	private String brand;
	private String colour;
	private String gender;

	public Shoe() {
		System.out.println("no args cons invoked");
	}

	public Shoe(String brand, String colour) {
		super();
		this.brand = brand;
		this.colour = colour;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if (obj != null) {
			if (obj instanceof Shoe) {
				Shoe casted = (Shoe) obj;
				String ref = casted.getBrand();
				String ref1 = casted.getColour();
				if (this.brand.equals(ref) && this.colour.equals(ref1)) {
					System.out.println("values matched:");
					return true;
				}
			}
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
