package com.xworkz.java.dto;

public class WalletDTO {

	private String companyName;
	private String material;
	private int totalCompartment;
	private float price;
	private boolean coinCompartement;
	
	public WalletDTO() {
		// TODO Auto-generated constructor stub
	}

	public WalletDTO(String companyName, String material, int totalCompartment, float price, boolean coinCompartement) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartment = totalCompartment;
		this.price = price;
		this.coinCompartement = coinCompartement;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTotalCompartment() {
		return totalCompartment;
	}

	public void setTotalCompartment(int totalCompartment) {
		this.totalCompartment = totalCompartment;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isCoinCompartement() {
		return coinCompartement;
	}

	public void setCoinCompartement(boolean coinCompartement) {
		this.coinCompartement = coinCompartement;
	}
	
	
	
}
