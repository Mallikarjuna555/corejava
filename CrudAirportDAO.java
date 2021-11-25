package com.xworkz.java;

public class CrudAirportDAO implements AirportDAO {

	AirportDTO[] airPortDTO = new AirportDTO[5];
	int counter = 0;

	@Override
	public boolean save(AirportDTO airPortDTO) {
		System.out.println("save method invoked");
		if (counter < this.airPortDTO.length && airPortDTO != null) {
			this.airPortDTO[counter++] = airPortDTO;
			System.out.println("save method is valid");
		} else {
			System.err.println("save method is invalid");
		}

		return true;
	}

	@Override
	public AirportDTO findByName(String Name) {
		System.out.println("search method invoked");
		for (int i = 0; i < airPortDTO.length; i++) {
			AirportDTO ref = this.airPortDTO[i];
			if (ref != null) {
				String res = ref.getName();
				if (airPortDTO.equals(res)) {
					System.out.println("search method valid");
				} else {
					System.out.println("search method invalid");
				}
			}
		}
		return null;
	}

	@Override
	public void displayAllDetails() {
		for (int i = 0; i < airPortDTO.length; i++) {
			AirportDTO ref = airPortDTO[i];
			if (ref != null) {
				System.out.println(ref.getLocation());
				System.out.println(ref.getName());
				System.out.println(ref.getType());
				System.out.println(ref.getId());
			}

		}
	}
}
