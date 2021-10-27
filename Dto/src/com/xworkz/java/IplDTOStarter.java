package com.xworkz.java;

import com.xworkz.java.dao.IplDAO;
import com.xworkz.java.dto.IplDTO;

public class IplDTOStarter {

	public static void main(String[] args) {

		// String name, Integer noOfPlayers, Integer teamSize, String ownerName, String
		// sponserName

		IplDTO iplDTO = new IplDTO("RCB", 11, 25, "UB", "puma");
		

		IplDTO iplDTO1 = new IplDTO("PBKS", 11, 25, "PRITA ZINTA", "UPL");
		IplDTO iplDTO2 = new IplDTO("MI", 11, 25, "AMBANI", "JIO");

		IplDAO iplDAO = new IplDAO();
		iplDAO.create(iplDTO);
		iplDAO.create(new IplDTO("csk", 11, 25, "srinivasan", "india cements"),3);
		iplDAO.create(iplDTO1);
		iplDAO.create(iplDTO2);
		
		iplDAO.occupiedIndex();
		boolean ref = iplDAO.search("csk");
		System.out.println(ref);

		IplDTO[] array = iplDAO.getIplDTOs();
		for (int i = 0; i < array.length; i++) {
			IplDTO fig = array[i];
			System.out.println("~~~~~~~~~~~");
			if (fig != null) {
				System.out.println("name:"+fig.getName());
				System.out.println("owner name:"+fig.getOwnerName());
				System.out.println("sponsers name:"+fig.getSponserName());
				System.out.println("no of players:"+fig.getNoOfPlayers());
				System.out.println("team size:"+fig.getTeamSize());
			} else {
				System.out.println("array is null");
			}
		}

	}

}
