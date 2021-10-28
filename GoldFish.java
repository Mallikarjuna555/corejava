package com.xworkz.java;

public class GoldFish {

	String colour;
	int size;
	
 	 public GoldFish() {
 		 //this("red");
 		 super();
		System.out.println("no args gold fish constructor invoked");
	}
 	 
 	 public GoldFish(String colour) {
 		 System.out.println("parameterized goldfish constructor is invoked:"+colour);
 	 }
}
