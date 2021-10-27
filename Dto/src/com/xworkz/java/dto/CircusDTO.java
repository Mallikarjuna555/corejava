package com.xworkz.java.dto;

public class CircusDTO {
	private String owner;
	private int ticketPrice;
	private int noOfAnimals;
	private int noOfShows;
	private float duration;
	
	public CircusDTO() {
		System.out.println("no argument constructor is invoked");
	}

	public CircusDTO(String owner, int ticketPrice, int noOfAnimals, int noOfShows, float duration) {
		super();
		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.duration = duration;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	

}
