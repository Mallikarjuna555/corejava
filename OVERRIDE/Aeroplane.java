package com.xworkz;

public class Aeroplane {

	private Integer no;
	private String company;
	private String govt;

	public Aeroplane(String company, String govt) {
		super();
		this.company = company;
		this.govt = govt;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked:");
		if (obj != null) {
			if (obj instanceof Aeroplane) {
				Aeroplane casted = (Aeroplane) obj;
				String ref = casted.getCompany();
				String ref1 = casted.getGovt();

				if (this.company.equals(ref) && this.govt.equals(ref1)) {
					System.out.println("matched found:");
					return true;
				}
			}

		}
		return false;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}
}
