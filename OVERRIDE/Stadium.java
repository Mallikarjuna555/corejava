package com.xworkz;

public class Stadium {
	private String name;
	private String city;
	private int areaInMeteres;
	
	public Stadium() {
	System.out.println("no args constructor invoked");
	}

	public Stadium(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if(obj!=null) {
			if(obj instanceof Stadium) {
				Stadium casted=(Stadium)obj;
			String ref=casted.getCity();
			String	ref1=casted.getName();
			if(this.city.equals(ref) && this.name.equals(ref1)) {
				System.out.println("matching found");
				return true;
			}
			}
			
		}
		
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
