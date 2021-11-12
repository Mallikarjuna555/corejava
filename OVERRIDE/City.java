package com.xworkz;

public class City {

	private String name;
	private String stateName;
	private String countryName;
	
	
	public City(String stateName, String countryName) {
		super();
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof City ) {
			City city=(City)obj;
			String ref=city.getCountryName();
		String	ref1=city.getStateName();
		if(this.countryName.equals(ref) && this.stateName.equals(ref1)) {
		System.out.println("matched:");	
		return true;
		}
			}
		}
			
			
		return false;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	
}
