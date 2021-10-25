package com.xworkz.java;

import com.xworkz.java.dto.BusDriverDTO;

public class BusDriverStarterDTO {

	public static void main(String[] args) {
	
		BusDriverDTO busDiverDTO=new BusDriverDTO();
		busDiverDTO.setAge(30);
		busDiverDTO.setId(35875);
		busDiverDTO.setKids(2);
		busDiverDTO.setLocation("mysore");
		busDiverDTO.setMarried(true);
		busDiverDTO.setName("antony");
		busDiverDTO.setSalary(25000.0f);
		
		BusDriverDTO busDriverDTO1=new BusDriverDTO("robert",35,40000.0f,true,3,"singapore",384657);
		BusDriverDTO busDriverDTO2=new BusDriverDTO("mark",35,40000.0f,true,3,"malyasia",384657);
		BusDriverDTO busDriverDTO3=new BusDriverDTO("cooper",35,40000.0f,true,3,"thailand",384657);
		BusDriverDTO busDriverDTO4=new BusDriverDTO("lenoard",35,40000.0f,true,3,"korea",384657);
		
		BusDriverDTO[] ref=new BusDriverDTO[5];
		ref[0]=busDriverDTO1;
		ref[1]=busDriverDTO2;
		ref[3]=busDriverDTO3;
				
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
			System.out.println("~~~~~~~~~~~~~~~~");
			
			if(ref[i]!=null) {
				System.out.println(ref[i].getAge());
				System.out.println(ref[i].getId());
				System.out.println(ref[i].getKids());
				System.out.println(ref[i].getLocation());
				System.out.println(ref[i].getName());
				System.out.println(ref[i].getSalary());
				System.out.println(ref[i].isMarried());							
			}
			else{
				System.err.println("array is full");
			}
		}
		
	}
	
	

}
