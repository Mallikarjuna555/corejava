package com.xworkz.java.dto;

public class BusDriverDTO {

	private String name;
	private int age;
	private float salary;
	private boolean married;
	private int kids;
	private String location;
	private int id;
	
	public BusDriverDTO() {
		System.out.println("no argument constructor");
	}

	public BusDriverDTO(String name, int age, float salary, boolean married, int kids, String location, int id) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.married = married;
		this.kids = kids;
		this.location = location;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public int getKids() {
		return kids;
	}

	public void setKids(int kids) {
		this.kids = kids;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
