package com.xworkz.java;

public class Fish {

	String location;
	boolean alive;
	
	public Fish() {
		System.out.println("no argument fish constructor invoked:");
	}
	
	public Fish(String location,boolean alive) {
		this.location=location;
		this.alive=alive;
		
	}
	
}
