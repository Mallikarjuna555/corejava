package com.xworkz.java;

public class NaturalSaloon extends Saloon{
	
	String name;
	int noOfHajamas;
	
	public NaturalSaloon() {
		//super();
		this("cast");
		System.out.println("no argument constructor invoked2");
	}
	
	public NaturalSaloon(String name) {
		this.name=name;
		System.out.println("parameterized constructor invoked:"+name);
	}

}
