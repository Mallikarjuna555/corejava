package com.xworkz.java;

public class CartDTO {

	private String name;
	private int quantity;
	private float price;
	private int items;

	public CartDTO() {
		System.out.println("no args constructor invoked:");
	}

	public CartDTO(String name, int quantity, float price, int items) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

}
