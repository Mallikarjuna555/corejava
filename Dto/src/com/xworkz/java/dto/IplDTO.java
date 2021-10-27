package com.xworkz.java.dto;

public class IplDTO {
	
	private String name;
	private Integer noOfPlayers;
	private Integer teamSize;
	private String ownerName;
	private String sponserName;
	
	public IplDTO() {
		System.out.println("no argument constructor is invoked");
	}

	public IplDTO(String name, Integer noOfPlayers, Integer teamSize, String ownerName, String sponserName) {
	
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.teamSize = teamSize;
		this.ownerName = ownerName;
		this.sponserName = sponserName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSponserName() {
		return sponserName;
	}

	public void setSponserName(String sponserName) {
		this.sponserName = sponserName;
	}
	
	

}
