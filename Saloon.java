package com.xworkz.java;

public class Saloon {

	String name;
	int noOfHajamas;
	
	public Saloon() {
		System.out.println("no argument saloon constructor invoked1");
		
	}
	public Saloon(String name,int no) {
		noOfHajamas=no;
		System.out.println("name:"+name +" :"+"no:"+no);
	}
	
	}
