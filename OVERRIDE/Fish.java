package com.xworkz;

public class Fish {

	private String name;
	private Integer price;
	private String colour;

	public Fish() {
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Fish) {
				Fish casted = (Fish) obj;
				String ref = casted.getName();
				Integer ref1 = casted.getPrice();
				if (this.name.equals(ref) && this.price.equals(ref1)) {
					System.out.println("values are matching");
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
