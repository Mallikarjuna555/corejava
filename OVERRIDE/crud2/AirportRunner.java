package com.xworkz.crud2;

import com.xworkz.Operator.Airport;

public class AirportRunner {

	public static void main(String[] args) {
		
		Airport ref=new Airport();
		ref.getAirportNames();
		
		ref.airportNames("bangalore");
		ref.airportNames("mumbai");
		ref.airportNames("kolkata");
		ref.airportNames("chennai");
		ref.airportNames("vizag");
		
		ref.delete(2);
		ref.update(0, "delhi");
		
		String[] array=ref.getAirportNames();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		
	}

}
