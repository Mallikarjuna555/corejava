package com.xworkz;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.xworkz.java.Enum.WatchType;

public class Watch {

	private String brand;
	private Integer price;
	private WatchType type;

	public Watch() {
		System.out.println("no args cons invoked");
	}

	public Watch(String brand, Integer price) {
		super();
		System.out.println("args cons invoked");
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("tostring method invokedSystem");
		return "titan";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode method invokedSystem");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked:");
		if (obj != null) {
			System.out.println("passed value is not null");
			if (obj instanceof Watch) {
				Watch casted = (Watch) obj;
				System.out.println("casted:");
				String ref = casted.getBrand();
				Integer ref1 = casted.getPrice();
				
				if (this.brand.equals(ref) && this.price.equals(ref1)) {
					System.out.println("matching found");
				} else {
					System.err.println("miss matching");
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
