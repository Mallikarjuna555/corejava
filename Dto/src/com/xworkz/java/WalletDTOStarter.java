package com.xworkz.java;

import com.xworkz.java.dao.WalletDAO;
import com.xworkz.java.dto.WalletDTO;

public class WalletDTOStarter {

	public static void main(String[] args) {
//(String companyName, String material, int totalCompartment, float price, boolean coinCompartement
		WalletDTO walletDTO = new WalletDTO("puma", "leather", 5, 199.0f, true);
		WalletDTO walletDTO1 = new WalletDTO("nike", "cloth", 5, 199.0f, true);
		WalletDTO walletDTO2 = new WalletDTO("adidas", "jeans", 5, 199.0f, true);

		WalletDAO walletDAO = new WalletDAO();
		walletDAO.create(walletDTO);
		walletDAO.create(walletDTO1);
		walletDAO.save(walletDTO2, 3);
		walletDAO.search("puma");

		WalletDTO[] ref = walletDAO.getwalletDTOs();
		for (int i = 0; i < ref.length; i++) {
			WalletDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~~~~~~");
			if (fig != null) {
				System.out.println("company:" + fig.getCompanyName());
				System.out.println("material:" + fig.getMaterial());
				System.out.println("price:" + fig.getPrice());
				System.out.println("total c" + fig.getTotalCompartment());
				System.out.println("coin:" + fig.isCoinCompartement());
			} else {
				System.err.println("error occured");
			}
		}

	}

}
