package com.xworkz.java;

import com.xworkz.City;

public class CityStarter {

	public static void main(String[] args) {
		
		City city=new City("karnataka","india");
		City city2=new City("karnataka","india");
		System.out.println(city.equals(city2));

	}

}
