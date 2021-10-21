package com.xworkz.Operator;

public class Resturant {

	private String[] ResturantNames=new String[5]; //get method
	private String location;
	int count=0;
	
	public Resturant() {
		this("BTM");
		System.out.println("default constructor");
	}
	
	public Resturant(String location) {
		this.location=location;
		System.out.println("paramterized constructor");
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void ResturantNames(String name) {
		if(count<5) {
			ResturantNames[count++]=name;
		}
		else {
			System.out.println("array is full");
		}
	}
	
	public void displayResturantNames() {
		for(int i=0;i<count;i++) {
			System.out.println(ResturantNames[i]);
		}
		
	}
}

