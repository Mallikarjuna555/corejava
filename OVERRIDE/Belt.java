package com.xworkz;

public class Belt {

	private Integer price;
	private String material;
	private char size;
	private String gender;

	public Belt() {
		System.out.println("no args constructor invoked");
	}

	public Belt(Integer price, String material) {
		super();
		System.out.println("parametrized cons invoked");
		this.price = price;
		this.material = material;
	}

	@Override
	public String toString() {
		System.out.println("toString method invoked:");
		return "ballet";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode method invoked:");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("euals method invoked");
		if (obj != null) {
			System.out.println("value passed is not null");

			if (obj instanceof Belt) {
				Belt casted = (Belt) obj;
				System.out.println("casted:");
				Integer ref = casted.getPrice();
				String ref1 = casted.getMaterial();
				if (this.price.equals(ref) && this.material.equals(ref1)) {
					System.out.println("matching found");
					return true;
				} else {
					System.err.println("matching not found");
				}

			}
		}
		return false;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		System.out.println("set price method invoked:");
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		System.out.println("set material method invoked:");
		this.material = material;
	}

}
