package com.xworkz.crud2;

import com.xworkz.Operator.Coffee;

public class CoffeeRunner {

	public static void main(String[] args) {
		
		Coffee coffee=new Coffee(200);
		System.out.println(coffee.price);
		coffee.getBrandNames();
		
		coffee.brandNames("starbucks");
		coffee.brandNames("nescafe");
		coffee.brandNames("bru");
		
		coffee.delete(2);
		coffee.update(1, "Davidoff");
		
		String[] arr=coffee.getBrandNames();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
