package com.xworkz.java.dao;

import com.xworkz.java.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] dto = new WebSeriesDTO[3];
	private int temp = 0;

	public void webSeriesNames(WebSeriesDTO dto) {
		if (temp < this.dto.length && dto != null) { // create66 method
			this.dto[this.temp++] = dto;
			System.out.println("create method invoked:".concat(dto.getCast()));
		} else {
			System.out.println("create method invalid");
		}
	}

	public void delete(int index) {
		if (index < dto.length && index >= 0) {
			this.dto[index] = null;
			System.out.println("delete method invoked:".concat(String.valueOf(index)));
		} else {
			System.err.println("delete method invalid:");
		}
	}

	public void update(int index, WebSeriesDTO dto) {
		if (index <this.dto.length && index >= 0 && dto != null) {
			this.dto[index] = dto;
			System.out.println("update method invoked:".concat(String.valueOf(index)).concat(dto.getCast()));
		} else {
			System.err.println("update method invalid");
		}
	}

	public WebSeriesDTO[] getDto() {
		return dto;
	}

}
