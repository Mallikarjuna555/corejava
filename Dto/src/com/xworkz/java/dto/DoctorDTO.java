package com.xworkz.java.dto;

public class DoctorDTO {
	private String name;
	private String specialization;
	private String hospitalName;
	private String gender;
	private int salary;
	private int age;
	
	public DoctorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDTO(String name, String specialization, String hospitalName, String gender, int salary, int age) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
