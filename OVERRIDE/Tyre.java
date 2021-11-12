package com.xworkz;

public class Tyre {

	private String brand;
	private Integer price;
	
	public Tyre(String brand, Integer price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
	System.out.println("equasl method invoked");
	if(obj!=null) {
		if(obj instanceof Tyre) {
			Tyre tyre=(Tyre)obj;
		String ref=tyre.getBrand();
		Integer	ref1=tyre.getPrice();
		return true;
		}
	}
	
		return false;
	}
	
	
	
}
