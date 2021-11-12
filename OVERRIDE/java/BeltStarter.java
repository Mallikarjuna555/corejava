package com.xworkz.java;

import com.xworkz.Belt;

public class BeltStarter {

	public static void main(String[] args) {

		Belt belt = new Belt();
		System.out.println(belt.toString());
		System.out.println(belt.hashCode());
		belt.setMaterial("leather");
		belt.setPrice(255);

		Belt belt1 = new Belt();
		belt1.setMaterial("leather");
		belt1.setPrice(255);

		System.out.println(belt.equals(belt1));

	}

}
