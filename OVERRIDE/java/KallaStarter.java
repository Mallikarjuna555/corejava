package com.xworkz.java;

import com.xworkz.Kalla;
import com.xworkz.WalletKalla;

public class KallaStarter {

	public static void main(String[] args) {

		Kalla kalla = new Kalla("pablo", 50, "drug dealer", 25);
		System.out.println(kalla.age);
		System.out.println(kalla.name);
		System.out.println(kalla.noOfCases);
		System.out.println(kalla.specialization);

		kalla.robbery("veerappan");

		WalletKalla walletKalla = new WalletKalla();
		walletKalla.robbery("bin laden");

		Kalla ref = new WalletKalla(); // override
		ref.robbery("dan bilzerian");

	}

}
