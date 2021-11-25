package com.xworkz.java;

public class AirportStarter {

	public static void main(String[] args) {

		// Integer id, String name, String location, String type
		AirportDTO airportDTO = new AirportDTO(5, "KIA", "bangalore", "International");

		AirportDAO airportDAO = new CrudAirportDAO();

		AirportAssociation association = new AirportAssociation(airportDAO);

		association.save(airportDTO);
		association.findByName(airportDTO);
		association.displayAllDetails();
	}

}
