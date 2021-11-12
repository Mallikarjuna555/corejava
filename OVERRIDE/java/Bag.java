package com.xworkz.java;

public class Bag {
	private Integer  price;
	private Integer section;

	public Bag() {
		System.out.println("no args constructor invoked");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public Bag(int price, int section) {
		super();
		this.price = price;
		this.section = section;
	}
	
	@Override
	public boolean equals(Object obj) {
	System.out.println("equals method invoked");
	if(obj!=null) {
		System.out.println("passed value is not null");
		if(obj instanceof Bag) {
			Bag casted=(Bag)obj;
			
		Integer ref=casted.getPrice();
		Integer	ref1=casted.getSection();
		
		if(this.price.equals(ref) && this.section.equals(ref1)) {
			System.out.println("match found");
			return true;
		}else {
			System.err.println("not found");
		}
		}
		
	}
		return false;
	}
	
	
}
