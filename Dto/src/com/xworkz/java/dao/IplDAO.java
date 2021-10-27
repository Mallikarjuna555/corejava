package com.xworkz.java.dao;

import com.xworkz.java.dto.IplDTO;

public class IplDAO {

	private IplDTO[] iplDTOs = new IplDTO[10];
	private int temp = 0;

	// create ,overloading, occupied value, search

	public void create(IplDTO dto) {
		System.out.println("create method invoked");
		if (temp < this.iplDTOs.length && dto != null) {
			this.iplDTOs[this.temp++] = dto;
			
			System.out.println("name:".concat(dto.getName()));
		} else {
			System.err.println("create method invalid");
		}
	}

	public void create(IplDTO dto, int digit) {
		System.out.println("method overloading invoked:");
		if (temp < this.iplDTOs.length && dto != null) {
			this.iplDTOs[digit] = dto;
			System.out.println("invoked:".concat(String.valueOf(digit)));
			temp++;
		} else {
			System.err.println("overloading is invalid");
		}
	}

	public void occupiedIndex() {
		System.out.println(temp);
	}

	public boolean search(String name) {
		System.out.println("search method invoked");
		
		for (int i = 0; i < iplDTOs.length; i++) {
			IplDTO ref = iplDTOs[i];
			if (ref != null) {
				String fig = ref.getName();
				System.out.println("name to be searched:"+name);
				

				if (name.equals(fig)) {
					System.out.println("name found:".concat(name));
					return true;
				} else {
					System.out.println("name not found:");
				}
			}
		}
		return false;
	}
	
	public IplDTO[] getIplDTOs() {
		return iplDTOs;
	}

}
