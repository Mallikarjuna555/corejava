package com.xworkz;

public class Food {

	private String name;
	private Integer price;
	private int quantityInKg;
	private String quality;

	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Food) {
				Food casted = (Food) obj;
				String ref = casted.getName();
				Integer ref1 = casted.getPrice();
				if (this.name.equals(ref) && this.price.equals(ref1)) {
					System.out.println("matched:");
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
