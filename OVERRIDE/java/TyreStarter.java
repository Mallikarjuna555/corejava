package com.xworkz.java;

import com.xworkz.Tyre;

public class TyreStarter {

	public static void main(String[] args) {
		
		Tyre tyre=new Tyre("MRF",35000);
		Tyre tyre1=new Tyre("MRF",35000);
		System.out.println(tyre.equals(tyre1));

	}

}
