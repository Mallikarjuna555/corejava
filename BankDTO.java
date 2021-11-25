package com.xworkz.java;

public class BankDTO {

	private Integer id;
	private String name;
	private String ifsc;
	private String branch;

	public BankDTO() {
		System.out.println("no args constructor invoked");

	}

	public BankDTO(Integer id, String name, String ifsc, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}