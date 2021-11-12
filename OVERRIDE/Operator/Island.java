package com.xworkz.Operator;

public class Island {

	private String[] IslandNames=new String[5]; //get method
	private String location;
	int count=0;
	
	public Island() {
		this("maldives");
		System.out.println("default constructor");
	}
	
	public Island(String location) {
		this.location=location;
		System.out.println("paramterized constructor");
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void IslandNames(String name) {
		if(count<5) {										//
			IslandNames[count++]=name;
		}
		else {
			System.out.println("array is full");
		}
	}
	
	public void displayIslandNames() {
		for(int i=0;i<count;i++) {
			System.out.println(IslandNames[i]);
		}
	}
}
