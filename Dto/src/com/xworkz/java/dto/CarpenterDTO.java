package com.xworkz.java.dto;

public class CarpenterDTO {
	// create,read,delete,update

	private String[] carpenterNames = new String[5];
	private String location;
	private int age;
	private int kids;
	private boolean married;
	private int temp = 0;

	public CarpenterDTO() {
		System.out.println("no argument constructor");
	}

	public void carpenterNames(String names) { // create
		if (temp < this.carpenterNames.length) {
			this.carpenterNames[temp++] = names;
			System.err.println("creat method invoked:".concat(names));
		} else {
			System.out.println("array is filled");
		}
	}

	public String[] getCarpenterNames() {
		return this.carpenterNames;
	}

	public void delete(int index) { // delete
		if (index < this.carpenterNames.length && this.carpenterNames.length >= 0) {
			this.carpenterNames[index] = null;
			System.out.println("delete method invoked:".concat(String.valueOf(index)));
		} else {
			System.err.println("delete method not invoked");
		}
	}

	public void update(int index, String name) { // update
		if (index < this.carpenterNames.length && this.carpenterNames.length >= 0) {
			this.carpenterNames[index] = name;
			System.out.println("update method invoked:".concat(String.valueOf(index)).concat("  ").concat(name));
		} else {
			System.err.println("update method invoked");
		}
	}

	public CarpenterDTO(String location, int age, int kids, boolean married) {
		super();
		this.location = location;
		this.age = age;
		this.kids = kids;
		this.married = married;
		this.temp = temp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKids() {
		return kids;
	}

	public void setKids(int kids) {
		this.kids = kids;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

}
