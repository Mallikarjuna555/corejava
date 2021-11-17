package com.xworkz.java;

public class IndianCitizen implements VotingRule, TrafficRule, MarriageRule {

	@Override
	public int validAge() {
		System.out.println("valid age method invoked:");
		return 0;
	}

	@Override
	public String validId() {
		System.out.println("valid id method invoked:");
		return null;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("valid insurance method invoked:");
		return false;
	}

	@Override
	public String licenseNo() {
		System.out.println("license method invoked:");
		return null;
	}

	@Override
	public boolean validLicence() {
		System.out.println("valid licence method invoked:");
		return false;
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("valid age method invoked:");

		if (gender == 'm' && age>21) {
			System.err.println("valid age");
			return true;
		}else {
			System.out.println("not valid");
		}

		return false;
	}

	private String name;
	private Address address;

	public void displayNameAndAddressDetails() {
		System.out.println("display method invoked:");
		
		name="arjun";
		Address ref=address.MYSORE;
		System.out.println(ref);
	}
	
}
