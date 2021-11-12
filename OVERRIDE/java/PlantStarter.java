package com.xworkz.java;

import com.xworkz.Plant;

public class PlantStarter {

	public static void main(String[] args) {

		Plant plant = new Plant("lotus", true);
		Plant plant1 = new Plant("lotus", true);
		System.out.println(plant.equals(plant1));
	}

}
