package com.xworkz.java;


import com.xworkz.java.dto.ArmyDTO;

public class ArmyDTOStarter {

	public static void main(String[] args) {
		
		ArmyDTO armyDTO=new ArmyDTO();
		
		armyDTO.setCountry("india");
		armyDTO.setMajor("kurnol arjun");
		armyDTO.setNoOfCarriers(1);
		armyDTO.setNoOfSoldiers(5000000);
		armyDTO.setNoOfTankers(5000);
		
		ArmyDTO armyDTO1=new ArmyDTO("japan",5000000,1,20000,"milka singh");
		ArmyDTO armyDTO2=new ArmyDTO("israel",5000000,1,20000,"pranav singh");
		ArmyDTO armyDTO3=new ArmyDTO("russia",5000000,1,20000,"harshad singh");
		ArmyDTO armyDTO4=new ArmyDTO("america",5000000,1,20000,"rakesh singh");
		ArmyDTO armyDTO5=new ArmyDTO("france",5000000,1,20000,"ramesh damani");
		
		ArmyDTO[] ref=new ArmyDTO[5];
		ref[0]=armyDTO1;
		ref[1]=armyDTO2;
		ref[2]=armyDTO3;
		ref[4]=armyDTO4;
		
		for (int i = 0; i < ref.length; i++) {
			ArmyDTO fig=ref[i];
			
			System.out.println("~~~~~~~~~~~~~~~~~~");
			
			if(fig!=null) {
				System.out.println(fig.getCountry());
				System.out.println(fig.getMajor());
				System.out.println(fig.getNoOfCarriers());
				System.out.println(fig.getNoOfSoldiers());
				System.out.println(fig.getNoOfTankers());
			}
			else{
				
			System.err.println("array is full");
			
		}
		
		
		}
	

	}

}
