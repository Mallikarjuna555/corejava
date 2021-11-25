package com.xworkz.java;

public class CrudBankDAO implements BankDAO{

	BankDTO[] bankDTO = new BankDTO[5];
	int counter = 0;

	@Override
	public boolean save(BankDTO bankDTO) {
		System.out.println("save method invoked");
		if (counter < this.bankDTO.length && bankDTO != null) {
			this.bankDTO[counter++] = bankDTO;
			System.out.println("save method is valid");
		} else {
			System.err.println("save method is invalid");
		}

		return true;
	}

	@Override
	public BankDTO findByName(String Name) {
		System.out.println("search method invoked");
		for (int i = 0; i < bankDTO.length; i++) {
			BankDTO ref = this.bankDTO[i];
			if (ref != null) {
				String res = ref.getName();
				if (bankDTO.equals(res)) {
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
		for (int i = 0; i < bankDTO.length; i++) {
			BankDTO ref = bankDTO[i];
			if (ref != null) {
				System.out.println(ref.getBranch());
				System.out.println(ref.getName());
				System.out.println(ref.getIfsc());
				System.out.println(ref.getId());
			}

		}
	}
}
