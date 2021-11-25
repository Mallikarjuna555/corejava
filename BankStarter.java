package com.xworkz.java;

public class BankStarter {

	public static void main(String[] args) {

		// Integer id, String name, String ifsc, String branch
		BankDTO bankDTO = new BankDTO(5, "KIA", "bangalore", "International");

		BankDAO bankDAO = new CrudBankDAO();

		BankAssociation association = new BankAssociation(bankDAO);

		association.save(bankDTO);
		association.findByName(bankDTO);
		association.displayAllDetails();
	}
}
