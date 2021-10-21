package com.xworkz.crud2;

import com.xworkz.Operator.Island;


public class IslandRunner {

	public static void main(String[] args) {
		
		Island island=new Island();
		island.getLocation();
			
		island.IslandNames("Male");
		island.IslandNames("maafushi");
		island.IslandNames("addu city");
		island.IslandNames("vaadhoo");
		island.IslandNames("addu atoll");
			
		island.displayIslandNames();
			
		}
	}


