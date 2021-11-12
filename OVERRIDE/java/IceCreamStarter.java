package com.xworkz.java;

import com.xworkz.IceCream;

public class IceCreamStarter {

	public static void main(String[] args) {

		IceCream iceCream = new IceCream();
		iceCream.setName("arun");

		IceCream iceCream2 = new IceCream();
		iceCream2.setName("arun");

		System.out.println(iceCream.equals(iceCream2));

	}

}
