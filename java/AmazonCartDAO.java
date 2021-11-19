package com.xworkz.java;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllDetails();
}
