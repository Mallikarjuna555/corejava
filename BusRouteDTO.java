package com.xworkz.java;

public class BusRouteDTO {

	private Integer id;
	private String source;
	private String destination;
	private String driverName;
	
	public BusRouteDTO() {
		System.out.println("no args constructor invoked");
	}

	public BusRouteDTO(Integer id, String source, String destination, String driverName) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.driverName = driverName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
	
}
