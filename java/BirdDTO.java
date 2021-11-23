package com.xworkz.java;

public class BirdDTO {

	private Integer id;
	private String breed;
	private Integer age;
	private String origin;
	private boolean canFly;

	public BirdDTO() {
		System.out.println("no args bird constructor invoked:");
	}

	public BirdDTO(Integer id, String breed, Integer age, String origin, boolean canFly) {
		super();
		this.id = id;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
		this.canFly = canFly;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
