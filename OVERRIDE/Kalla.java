package com.xworkz;

public class Kalla {

	public String name;
	public int age;
	public String specialization;
	public int noOfCases;

	public Kalla() {
		super();
	}

	public Kalla(String name, int age, String specialization, int noOfCases) {
		super();
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.noOfCases = noOfCases;
	}

	public void robbery(String name) {
		System.out.println("method invoked 1:".concat(name));
	}

	public void itemSell(int age) {
		System.out.println("method invoked 2:".concat(String.valueOf(age)));
	}

}
