package com.xworkz.crud2;

import com.xworkz.Operator.Stadium;

public class StadiumRunner {

	public static void main(String[] args) {
		
		Stadium stadium=new Stadium();
		stadium.getStadiumNames();
		
		stadium.stadiumNames("bangalore");
		stadium.stadiumNames("mysore");
		stadium.stadiumNames("delhi");
		stadium.stadiumNames("kolkata");
		stadium.stadiumNames("mumbai");
		
		stadium.delete(4);
		stadium.update(3, "hyderbad");
		
		String[] ref=stadium.getStadiumNames();
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}

	}

}
