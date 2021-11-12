package com.xworkz;

public class Ipod {
	private Integer modelNo;

	public Ipod() {
		System.out.println("no args constructor invoked");
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode method invoked : ");
		return 100;
	}

	@Override
	public String toString() {
		System.out.println("tostring method invoked :");
		return "apple"; // doubt(super)
	}

	@Override
	public boolean equals(Object obj) {
		System.err.println("equals method invoked:");
		// System.out.println(obj);
		if (obj != null) {
			System.out.println("value passed is not null");

			if (obj instanceof Ipod) {
				Ipod casted = (Ipod) obj;
				System.out.println("casted");

				Integer ref = casted.getModelNo();
				if (this.modelNo.equals(ref)) {
					System.out.println("matched:");
					return true;
				}
			} else {
				System.err.println("error");
			}
		}
		return false;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		System.out.println("set model no");
		this.modelNo = modelNo;
	}

}
