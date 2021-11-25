package com.xworkz.java;

public interface AirportDAO {

	

		boolean save(AirportDTO airPortDTO);

		AirportDTO findByName(String Name);

		void displayAllDetails();
	}


