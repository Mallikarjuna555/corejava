package com.xworkz.java;

import com.xworkz.Ipod;

public class IpodRunner {

	public static void main(String[] args) {

		Ipod ipod = new Ipod();
		System.out.println(ipod.toString());
		System.out.println(ipod.hashCode());

		// System.out.println(ipod.equals(ipod));

		ipod.setModelNo(1823);

		Ipod ipod2 = new Ipod();
		ipod2.setModelNo(1823);
		System.out.println(ipod.equals(ipod2));

	}

}
