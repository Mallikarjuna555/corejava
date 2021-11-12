package com.xworkz.crud2;

import com.xworkz.Operator.Resturant;

public class ResturanRunner {

	public static void main(String[] args) {
	
			
		Resturant resturant=new Resturant();
		resturant.getLocation();
			
		resturant.ResturantNames("UDUPI");
		resturant.ResturantNames("GOKUL");
		resturant.ResturantNames("BTM");
		resturant.ResturantNames("sapphire");
		resturant.ResturantNames("COASTAL");
			
		resturant.displayResturantNames();
			
		}

	}


