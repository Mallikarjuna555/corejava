package com.xworkz.Operator;

public class Labour {

	private String[] labourNames = new String[3];
	private int count = 0;

	public void labourNames(String names) {
		if (count < this.labourNames.length) {
			this.labourNames[count++] = names;
			System.out.println("create method:".concat(names));
		}
	}

	public String[] getLabourNames() {
		return this.labourNames;
	}

	public void delete(int digit) {
		if (digit < this.labourNames.length && this.labourNames.length >= 0) {
			this.labourNames[digit] = null;
		}
	}

	public void update(int digit, String name) {
		if (digit < this.labourNames.length && this.labourNames.length >= 0) {
			this.labourNames[digit] = name;
		}
	}

}
