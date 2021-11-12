package com.xworkz.crud2;

import com.xworkz.Operator.Resturant;
import com.xworkz.Operator.Rocket;

public class RocketRunner {

	public static void main(String[] args) {
		
		
		Rocket rocket=new Rocket();
		rocket.getMission();
			
		rocket.RocketNames("ISRO");
		rocket.RocketNames("NASA");
		rocket.RocketNames("SPACEX");
		rocket.RocketNames("CNES");
		rocket.RocketNames("ROSCOSMOS");
			
		rocket.displayRocketNames();
			
		}

	}



