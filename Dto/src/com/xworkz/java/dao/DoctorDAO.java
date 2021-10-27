package com.xworkz.java.dao;

import com.xworkz.java.dto.DoctorDTO;

public class DoctorDAO {
	// create,overloading,index,search

	private DoctorDTO[] doctorDTO = new DoctorDTO[5];
	private int count = 0;
	// 0,1,2,3,4,5,,,,,,,,,,

	public void create(DoctorDTO dto) {
		System.out.println("create method invoked:");
		if (dto != null && count < this.doctorDTO.length) {
			this.doctorDTO[count++] = dto;
			System.out.println("invoked:".concat(dto.getGender()));
		} else {
			System.err.println("create:");
		}
	}

	public void create(DoctorDTO dto, int index) {
		System.out.println("overloading invoked");
		if (index < this.doctorDTO.length && dto != null) {
			this.doctorDTO[index] = dto;
			System.out.println("overloading:".concat(String.valueOf(index)));
		} else {
			System.err.println("overload:");
		}
	}

	public void indexoccupied() {
		System.out.println("index:" + count);
	}

	public boolean search(String name) {
		System.out.println("search method invoked:");

		for (int i = 0; i < doctorDTO.length; i++) {
			DoctorDTO ref = this.doctorDTO[i];
			if (ref != null) {
				String fig = ref.getHospitalName();
				System.out.println(fig);
				if (fig.equals(name)) {
					System.out.println("name found:");
					return true;
				} else {
					System.err.println("name not found:");
				}
			}
		}

		return false;
	}

	public DoctorDTO[] getDoctorDTO() {
		return doctorDTO;
	}

}
