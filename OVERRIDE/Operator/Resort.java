package com.xworkz.Operator;

public class Resort {

	private String[] ResortNames=new String[5]; //get method
	private String location;
	int count=0;
	
	public Resort() {
		this("Chikmagaluru");
		System.out.println("default constructor");
	}
	
	public Resort(String location) {
		this.location=location;
		System.out.println("paramterized constructor");
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void ResortNames(String name) {
		if(count<5) {
			ResortNames[count++]=name;
		}
		else {
			System.out.println("array is full");
		}
	}
	
	public void displayResortNames() {
		for(int i=0;i<count;i++) {
			System.out.println(ResortNames[i]);
		}
	}
}


