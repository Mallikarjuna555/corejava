package com.xworkz.java.dao;

import com.xworkz.java.dto.LawyerDTO;

public class LawyerDAO {
//	
	private LawyerDTO[] lawyerDTO = new LawyerDTO[10];
	private int digit = 0;
	

	// create opertaion
	public void save(LawyerDTO lawyerDTO) {
		System.out.println("save:");
		if (digit < this.lawyerDTO.length && lawyerDTO != null) {
			this.lawyerDTO[digit++] = lawyerDTO;
			System.out.println("save method invoked:".concat(lawyerDTO.getName()));
		} else {
			System.err.println("save invalid");
		}
	}

	// create overloading
	public void create(LawyerDTO lawyerDTO, int index) {
		System.out.println("create:");
		if (index < this.lawyerDTO.length && lawyerDTO != null) {
			this.lawyerDTO[index] = lawyerDTO;
			System.out.println("create method invoked:".concat(lawyerDTO.getQualification()));
		} else {
			System.err.println("create invalid:");
		}

	}

	//delete method
	public void delete(int digit) {
		System.out.println("delete:");
		if (digit < this.lawyerDTO.length) {
			System.out.println("delete method invoked:".concat(String.valueOf(digit)));
		} else {
			System.err.println("delete is invalid");
		}
	}

	//search
	public boolean search(String name) {
		System.out.println("search string method invoked");
		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = lawyerDTO[i];

			if (ref != null) {
				String fig = ref.getName();
				System.out.println(fig);
				if (fig.equals(name)) {
					System.out.println("name found:" + name);
					return true;
				} else {
					System.out.println("name not found:" + name);
				}
			}
		}

		return false;
	}

	public boolean search(int digit) {
		System.out.println("search int method invoked:");
		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = lawyerDTO[i];

			if (ref != null) {
				int fig = ref.getCaseWon();
				System.out.println(fig);

				if (fig != 0) {
					if (fig == digit) {
						System.out.println("case won:" + fig);
					} else {
						System.err.println("case lost");
					}
				}
			}
		}

		return false;
	}

	//get qualification
	public void getQualifcationByName(String name) {
		System.out.println("qualifcation by name:");

		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = lawyerDTO[i];
			if (ref != null) {
				String fig = ref.getName();

				if (name == fig) {
					String res = ref.getQualification();
					System.out.println(res);

				}
			}
		}
	}

	//get lawyer 
	public void getLawyerWithMaxExperience() {
		System.out.println("max experinece:");
		int max=0;
		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = lawyerDTO[i]; 
			if(ref!=null) {
				int fig = ref.getExperience();
				if(max<fig) {
					max=fig;
				}
					
				}
			}
		System.out.println(max);
			
		
		}
	

	public void getExpByName(String name) {
		System.out.println("get exp invoked:");
		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = lawyerDTO[i];

			if (ref != null) {
				String res = ref.getName();

				if (res.equals(name)) {
					System.out.println("exp:" + ref.getExperience());
				}
			}
		}

	}

	public LawyerDTO[] getLawyerDTO() {
		return lawyerDTO;
	}

}
