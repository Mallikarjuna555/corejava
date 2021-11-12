package com.xworkz.java;

public class ShoeStarter {

	public static void main(String[] args) {

		Shoe shoe = new Shoe("puma", "white");
		Shoe shoe2 = new Shoe("puma", "white");
		System.out.println(shoe.equals(shoe2));

	}

}
