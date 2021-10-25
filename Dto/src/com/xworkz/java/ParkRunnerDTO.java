package com.xworkz.java;

import com.xworkz.java.dto.ParkDTO;

public class ParkRunnerDTO {

	public static void main(String[] args) {

		ParkDTO parkDTO = new ParkDTO();
		parkDTO.getParkNames();

		parkDTO.parkNames("nandanvana");
		parkDTO.parkNames("lal bagh");
		parkDTO.parkNames("cubbon park");

		ParkDTO parkDTO1 = new ParkDTO("mysore", 65, true, 150);
		ParkDTO parkDTO2 = new ParkDTO("bangalore", 25, true, 150);
		ParkDTO parkDTO3 = new ParkDTO("dvg", 15, true, 150);
		ParkDTO parkDTO4 = new ParkDTO("shivamogga", 5, true, 150);

		ParkDTO[] ref = new ParkDTO[5];
		ref[0] = parkDTO1;
		ref[1] = parkDTO2;
		ref[3] = parkDTO3;

		for (int i = 0; i < ref.length; i++) {
			ParkDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~~~~~~");
			if (fig != null) {
				System.out.println(fig.getInAcres());
				System.out.println(fig.getLocation());
				System.out.println(fig.getNoOfSittings());
				System.out.println(fig.isPlantation());
			} else {
				System.err.println("array is full");
			}
		}

	}

}
