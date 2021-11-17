package com.xworkz.java;

public  class mythriHostelRule implements HostelRule, VisitorRule {

	@Override
	public int inTime() {
		System.out.println("invoked method");
		return 5;
	}

	@Override
	public int visitingDay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
