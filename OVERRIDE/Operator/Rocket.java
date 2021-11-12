package com.xworkz.Operator;

public class Rocket {

	private String[] RocketNames=new String[5]; //get method
	private String mission;
	int count=0;
	
	public Rocket() {
		this("CHANDRAYANA");
		System.out.println("default constructor");
	}
	
	public Rocket(String mission) {
		this.mission=mission;
		System.out.println("paramterized constructor");
	}
	
	public String getMission() {
		return this.mission;
	}
	
	public void RocketNames(String name) {
		if(count<5) {
			RocketNames[count++]=name;
		}
		else {
			System.out.println("array is full");
		}
	}
	
	public void displayRocketNames() {
		for(int i=0;i<count;i++) {
			System.out.println(RocketNames[i]);
		}
		
	}
}
