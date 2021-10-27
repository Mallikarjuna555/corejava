package com.xworkz.java.dao;

import com.xworkz.java.dto.CameraDTO;

public class CameraDAO {

	private CameraDTO[] dto=new CameraDTO[5];
	private int temp=0;
	
	public void save(CameraDTO dto) {
	if(temp<this.dto.length && dto!=null) {
		this.dto[temp++]=dto;
		System.out.println("save invoked".concat(String.valueOf(dto)).concat(dto.getCompany()).concat("   "));
	}else {
		System.err.println("save is invalid");
	}	
	}
	
	
	public void delete(int index) {
		if(index<this.dto.length && index>=0) {
			this.dto[index]=null;
			System.out.println("delete invoked:".concat(String.valueOf(index)) );
		}else {
			System.err.println("delete is invalid");
		}
	}
	
	public void update(int index,CameraDTO names) {
		if(index<this.dto.length && index>=0 && names!=null) {
			this.dto[index]=names;
			System.out.println("update invoked:".concat(names.getCompany()).concat(" ").concat(String.valueOf(index)));
		}else {
			System.err.println("update is invoked");
		}
		
	}
	
	public CameraDTO[] getDto() {
		return dto;
	}
}
