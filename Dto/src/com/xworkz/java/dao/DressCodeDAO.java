package com.xworkz.java.dao;

import com.xworkz.java.dto.DressCodeDTO;

public class DressCodeDAO {

	private DressCodeDTO[] dto = new DressCodeDTO[5];
	private int temp = 0;

//create

	public void save(DressCodeDTO dto) {
		if (temp < this.dto.length) {
			this.dto[temp++] = dto;
			System.out.println("create method invoked:".concat(dto.getMaterial()));
		} else {
			System.out.println("create method invalid:");
		}
	}

	public void delete(int index) {
		if (index < this.dto.length && index >= 0 ) {
			this.dto[index] = null;
			System.out.println("delete method invoked:".concat(String.valueOf(index)));
		} else {
			System.out.println("delete method invlaid:");
		}
	}

	public void update(int index, DressCodeDTO dto) {
		if (index < this.dto.length && index >= 0 && dto != null) {
			this.dto[index] = dto;
			System.out.println("update method invoked:".concat(String.valueOf(index)).concat("  ").concat(String.valueOf(dto)));
		} else {
			System.out.println("update method invalid");
		}
	}

	public DressCodeDTO[] getDto() {
		return dto;
	}
}
