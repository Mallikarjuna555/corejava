package com.xworkz;

public class IceCream {

	private String name;

	public IceCream() {
		System.out.println("no args constructor invoked");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if (obj != null) {
			System.out.println("passed value is not null");

			if (obj instanceof IceCream) {
				IceCream casted = (IceCream) obj;
				System.out.println("casted:");
				String ref = casted.getName();

				if (this.name.equals(ref)) {
					System.out.println("matched");
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

}
