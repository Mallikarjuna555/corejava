package com.xworkz.java;

public interface BirdDAO {

	boolean save(BirdDTO birdDTO);

	BirdDTO findByOrigin(String origin);

	void displayAllDetails();

}
