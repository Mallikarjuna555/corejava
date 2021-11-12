package com.xworkz.java;

import com.xworkz.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
	
		Stadium stadium=new Stadium("chinnaswamy","bangalore");
		Stadium stadium2=new Stadium("chinnaswamy","bangalore");
		System.out.println(stadium.equals(stadium2));

	}

}
