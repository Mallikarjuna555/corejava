package com.xworkz;

import com.xworkz.java.HostelRule;
import com.xworkz.java.VisitorRule;
import com.xworkz.java.mythriHostelRule;

public class HostelRuleStarter {

	public static void main(String[] args) {

		HostelRule hostelRule = new mythriHostelRule();
		//mythriHostelRule casting=(mythriHostelRule)hostelRule;         casting::
		//casting.inTime();
		hostelRule.inTime();                  //10 methods can access(9 from objects 1 from class)

		mythriHostelRule ref = new mythriHostelRule();
		ref.visitingDay();

		VisitorRule visitorRule = new mythriHostelRule();
		visitorRule.visitingDay();
		Object object = new Object();
		System.out.println(ref.inTime());

	}
}
