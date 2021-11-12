package com.xworkz.java;

import com.xworkz.Food;

public class FoodStarter {

	public static void main(String[] args) {

		Food food = new Food("pizza", 250);
		Food food2 = new Food("pizza", 250);

		System.out.println(food.equals(food2));

	}

}
