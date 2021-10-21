package com.xworkz.crud2;

import com.xworkz.Operator.Resort;


public class ResortRunner {

	public static void main(String[] args) {
		
		Resort resort=new Resort();
		resort.getLocation();
			
		resort.ResortNames("trivik");
		resort.ResortNames("the serai");
		resort.ResortNames("gateway");
		resort.ResortNames("kaveri");
		resort.ResortNames("vismita");
			
		resort.displayResortNames();
			
		}

}
