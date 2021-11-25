package com.xworkz.java;

public interface BankDAO {


	boolean save(BankDTO BankDTO);

	BankDTO findByName(String Name);

	void displayAllDetails();
}
