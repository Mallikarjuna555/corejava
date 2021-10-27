package com.xworkz.java.dao;

import com.xworkz.java.dto.BucketDTO;

public class BucketDAO {
	
	private BucketDTO[] dto=new BucketDTO[5];
	private int temp=0;
	
	public void save(BucketDTO dto) {
		if(temp<this.dto.length && dto!=null) {
			this.dto[temp++]=dto;
			System.out.println("crete method invoked:".concat(String.valueOf(temp)).concat("   ").concat(dto.getCompany()));
		}else {
			System.out.println("crete invalid");
		}
	}
	
	public void delete(int index) {
		if(index<this.dto.length && index>=0) {
			this.dto[index]=null;
			System.out.println("delete method invoked".concat(String.valueOf(index)));
		}else {
			System.out.println("delete invalid");
		}
	}
	
	public void update(int index,BucketDTO dtos) {
		if(index<this.dto.length && index>=0 && dtos!=null) {
			this.dto[index]=dtos;
			System.out.println("update invoked".concat(String.valueOf(index)).concat("   ").concat(dtos.getColour()));
		}else {
			System.out.println("updte invalid");
		}
	}
	
	public BucketDTO[] getDto() {
		return dto;
	}

}
