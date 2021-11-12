package com.xworkz.Operator;

public class Gin {

	private String[] brandNames=new String[5]; //get method
	private int price;
	int count=0;
	
	public Gin() {
		this(1500);
		System.out.println("default constructor");
	}
	
	public Gin(int price) {
		this.price=price;
		System.out.println("paramterized constructor");
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void brandNames(String name) {
		if(count<5) {
			brandNames[count++]=name;
		}
		else {
			System.out.println("array is full");
		}
	}
	
	public void dispalyBrandNames() {
		for(int i=0;i<count;i++) {
			System.out.println(brandNames[i]);
		}
		
	}
}


