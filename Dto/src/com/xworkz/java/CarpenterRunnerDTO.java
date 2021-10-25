package com.xworkz.java;

import com.xworkz.java.dto.CarpenterDTO;

public class CarpenterRunnerDTO {

	public static void main(String[] args) {

		CarpenterDTO carpenterDTO = new CarpenterDTO();
		carpenterDTO.carpenterNames("cook");
		carpenterDTO.carpenterNames("andrew");
		carpenterDTO.carpenterNames("root");
		carpenterDTO.carpenterNames("stokes");
		carpenterDTO.carpenterNames("wood");

		carpenterDTO.delete(1);
		carpenterDTO.update(2, "buttler");

		String[] ref1 = carpenterDTO.getCarpenterNames();
		for (int i = 0; i < ref1.length; i++) {
			System.out.println(ref1[i]);

		}

		CarpenterDTO carpenterDTO1 = new CarpenterDTO("oval", 35, 3, true);
		CarpenterDTO carpenterDTO2 = new CarpenterDTO("londom", 33, 3, true);
		CarpenterDTO carpenterDTO3 = new CarpenterDTO("nottingham", 32, 3, true);
		CarpenterDTO carpenterDTO4 = new CarpenterDTO("brimngham", 30, 3, true);

		CarpenterDTO[] ref = new CarpenterDTO[5];
		ref[0] = carpenterDTO1;
		ref[1] = carpenterDTO2;
		ref[3] = carpenterDTO4;

		for (int i = 0; i < ref.length; i++) {
			CarpenterDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~~~~");

			if (fig != null) {
				System.out.println(fig.getAge());
				System.out.println(fig.getKids());
				System.out.println(fig.getLocation());
				System.out.println(fig.isMarried());
			} else {
				System.err.println("aarrrraaaayyy is full");
			}
		}

	}

}
