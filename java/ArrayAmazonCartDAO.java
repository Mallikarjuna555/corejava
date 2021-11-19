package com.xworkz.java;

public class ArrayAmazonCartDAO implements AmazonCartDAO {

	private CartDTO[] dtos = new CartDTO[10];
	int counter = 0;

	@Override
	public boolean save(CartDTO cartDTO) {
		System.out.println("invoked save method");
		if (cartDTO != null && counter < dtos.length) {
			dtos[counter++] = cartDTO;
			return true;
		}
		return false;
	}

	@Override
	public CartDTO findByName(String name) {
		System.out.println("invoked findByName");
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				CartDTO dtoRef = dtos[i];
				if (dtoRef != null) {

					String nameRef = dtoRef.getName();

					if (name.equalsIgnoreCase(nameRef)) {
						return dtoRef;
					}

				} else {
					System.out.println("null reference at index ".concat(String.valueOf(i)));
				}
			}
		}
		return null;
	}

	public void displayAllCartDeatils() {
		System.out.println("invoked displayAllCartDetails method");

		for (int i = 0; i < dtos.length; i++) {
			CartDTO dtoRef = dtos[i];
			if (dtoRef != null) {
				System.out.println(dtoRef.getName());
				System.out.println(dtoRef.getQuantity());
				System.out.println(dtoRef.getItems());
				System.out.println(dtoRef.getPrice());
			} else {
				System.out.println("null at the index ".concat(String.valueOf(i)));
			}
		}

	}

	@Override
	public void displayAllDetails() {
		System.out.println("details method invoked:");
	}

}
