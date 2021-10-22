package com.xworkz.crud2;

import com.xworkz.Operator.Labour;

public class LabourRunner {

	public static void main(String[] args) {

		Labour labour = new Labour();
		labour.getLabourNames();

		labour.labourNames("antony");
		labour.labourNames("mark");
		labour.labourNames("robert");

		labour.delete(2);
		labour.update(1, "andrew");

		String[] ref = labour.getLabourNames();
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}

	}

}
