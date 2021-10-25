package com.xworkz.java;

import com.xworkz.java.dto.CraneDTO;

public class CraneDTOStarter {

	public static void main(String[] args) {

		CraneDTO craneDTO = new CraneDTO();
		craneDTO.driverNames("babar");
		craneDTO.driverNames("rizwan");
		craneDTO.driverNames("afridi");
		craneDTO.driverNames("imad");
		craneDTO.driverNames("zaman");

		craneDTO.delete(2);
		craneDTO.update(3, "haffez");

		String[] ref = craneDTO.getDriverNames();

		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}

		CraneDTO craneDTO1 = new CraneDTO("escorts", "ajay", 1565.0f, 54815478.0f);
		CraneDTO craneDTO2 = new CraneDTO("hmt", "ajay", 1565.0f, 54815478.0f);
		CraneDTO craneDTO3 = new CraneDTO("mahindra", "ajay", 1565.0f, 54815478.0f);
		CraneDTO craneDTO4 = new CraneDTO("suzuki", "ajay", 1565.0f, 54815478.0f);

		CraneDTO[] ref1 = new CraneDTO[3];
		ref1[0] = craneDTO1;
		ref1[2] = craneDTO3;

		for (int j = 0; j < ref1.length; j++) {
			CraneDTO fig = ref1[j];
			System.out.println("~~~~~~~~~");
			if (fig != null) {

				System.out.println(fig.getCompany());
				System.out.println(fig.getOwner());
				System.out.println(fig.getPrice());
				System.out.println(fig.getWeightInTon());
			}

			else {
				System.err.println("array is not pointing to any memory location");
			}
		}

	}

}
