package com.xworkz;

import com.xworkz.java.AfricanCitizen;
import com.xworkz.java.IndianCitizen;
import com.xworkz.java.MarriageRule;
import com.xworkz.java.TrafficRule;
//import com.xworkz.java.VisitorRule;
import com.xworkz.java.VotingRule;

public class IndianCitizenStarter {

	public static void main(String[] args) {

		IndianCitizen indianCitizen = new IndianCitizen();
		indianCitizen.validAge();
		indianCitizen.validId();
		indianCitizen.validLicence();
		indianCitizen.licenseNo();
		indianCitizen.validInsurance();
		System.err.println(indianCitizen.validAge('m', 25));
		indianCitizen.displayNameAndAddressDetails();

		VotingRule votingRule = new IndianCitizen();
		TrafficRule trafficRule = new IndianCitizen();
		MarriageRule marriageRule = new IndianCitizen();
		Object object = new Object();

		AfricanCitizen africanCitizen = new AfricanCitizen();

		VotingRule votingRule1 = new IndianCitizen();
		TrafficRule trafficRule1 = new IndianCitizen();
		MarriageRule marriageRule1 = new IndianCitizen();
		Object object1 = new Object();

		System.out.println(africanCitizen.validAge());
		System.out.println(africanCitizen.validId());
		System.out.println(africanCitizen.validLicence());
		System.out.println(africanCitizen.licenseNo());
		System.out.println(africanCitizen.validInsurance());
		System.out.println(africanCitizen.validAge('f', 18));
		africanCitizen.displayNameAndAddressDetails();
	}

}
