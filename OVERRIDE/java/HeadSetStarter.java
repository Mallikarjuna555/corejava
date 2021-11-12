package com.xworkz.java;

import com.xworkz.HeadSet;

public class HeadSetStarter {

	public static void main(String[] args) {
	
		HeadSet headSet=new HeadSet("boat","medium",5);
		HeadSet headSet1=new HeadSet("boat","medium",5);
		System.out.println(headSet.equals(headSet1));

	}

}
