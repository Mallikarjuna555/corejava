package com.xworkz.Operator;

public class CoolDrink {

	private String[] brandNames = new String[5];
	private int temp = 0;

	public void brandNames(String name) { // create
		
		
		if (temp < 5) {
			this.brandNames[this.temp++] = name;
			System.out.println("create method:".concat(name));
		} else {
			System.out.println("array is full");
		}
	}

	public String[] getBrandNames() { // getter
		return this.brandNames;
	}

	public void delete(int name) { // delete method
		System.out.println("delete method index:".concat(String.valueOf(name)));
		if (name < this.brandNames.length && this.brandNames.length >= 0) {
			this.brandNames[name] = null;
			
		} else {
			System.out.println("delete method");
		}
	}

	public void update(int digit, String name) { // update method
		System.out.println("update method index:".concat(String.valueOf(digit)).concat(" ").concat(name));
		if (digit < this.brandNames.length && this.brandNames.length >= 0) {
			this.brandNames[digit] = name;
			
		} else {
			System.out.println("update method");
		}
	}
}
