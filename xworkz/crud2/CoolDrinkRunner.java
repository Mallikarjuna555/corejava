package com.xworkz.crud2;

import com.xworkz.Operator.CoolDrink;

public class CoolDrinkRunner {
	// debug
	public static void main(String[] args) {

		CoolDrink coolDrink = new CoolDrink();
		coolDrink.getBrandNames();

		coolDrink.brandNames("Fanta");
		coolDrink.brandNames("maaza");
		coolDrink.brandNames("dew");
		coolDrink.brandNames("Fizz");
		coolDrink.brandNames("coke");
		
		String[] arr = coolDrink.getBrandNames();
		for (int i = 0; i < arr.length; i++) {
			String ref = arr[i];
			System.out.println(ref);
		}

		coolDrink.delete(2);
		coolDrink.update(1, "slice");

		String[] arr1 = coolDrink.getBrandNames();
		for (int i = 0; i < arr1.length; i++) {
			String ref1 = arr1[i];
			System.out.println(ref1);
		}

	
	}
}
