package com.xworkz.java.dto;

public class TimerDTO {

	private boolean correctTime;
	private boolean digital;
	private int bell;
	private String brand;
	
	public TimerDTO() {
		// TODO Auto-generated constructor stub
	}

	public TimerDTO(boolean correctTime, boolean digital, int bell, String brand) {
		super();
		this.correctTime = correctTime;
		this.digital = digital;
		this.bell = bell;
		this.brand = brand;
	}

	public boolean isCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(boolean correctTime) {
		this.correctTime = correctTime;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public int getBell() {
		return bell;
	}

	public void setBell(int bell) {
		this.bell = bell;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
