package com.xworkz.java;

import com.xworkz.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
		
		Aeroplane aeroplane=new Aeroplane("Qatar","shiekh");
		Aeroplane aeroplane1=new Aeroplane("Qatar","shiekh");
		System.out.println(aeroplane.equals(aeroplane1));

	}

}
