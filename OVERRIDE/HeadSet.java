package com.xworkz;

import com.xworkz.java.Enum.HeadSetType;

public class HeadSet {

	private String brand;
	private String battery;
	private Integer warranty;
	private HeadSetType type;

	public HeadSet() {
		System.out.println("no args constructor invoked");
	}

	public HeadSet(String brand, String battery, int warranty) {
		super();
		System.out.println("args constructor invoked");
		this.brand = brand;
		this.battery = battery;
		this.warranty = warranty;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("no args constructor invoked");
		if (obj != null) {
			System.out.println("args passed is not null");
			if (obj instanceof HeadSet) {
				HeadSet casted = (HeadSet) obj;
				System.out.println("casted:");
				String ref = casted.getBattery();
				String ref1 = casted.getBrand();
				Integer ref2 = casted.getWarranty();
				if (this.battery.equals(ref) && this.brand.equals(ref1) && this.warranty.equals(ref2)) {
					System.out.println("matching found:");
					return true;
				}else {
					System.err.println("miss match");
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

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public Integer getWarranty() {
		return warranty;
	}

	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}

}
