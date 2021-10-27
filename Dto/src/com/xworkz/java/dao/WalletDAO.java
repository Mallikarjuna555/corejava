package com.xworkz.java.dao;

import com.xworkz.java.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] walletDTOs=new WalletDTO[10];
	private int temp=0;
	
	public void create(WalletDTO dto) {
		System.out.println("create method invoked:");
		if(temp<this.walletDTOs.length && dto!=null) {
			this.walletDTOs[temp++]=dto;
			System.out.println("invoked:".concat(dto.getCompanyName()));
		}else {
			System.err.println("create method invalid");
		}
	}
	
	public void save(WalletDTO dto,int digit) {
		System.out.println("save method invoked:");
		if(digit<this.walletDTOs.length && dto!=null) {
			this.walletDTOs[digit]=dto;
			System.out.println("invoked:".concat(String.valueOf(digit)));
		}else {
			System.err.println("overloading method invoked:");
		}
	}
	
	public void indexOccupied() {
		System.out.println(temp);
	}
	
	public boolean search(String name) {
		System.out.println("search invoked");
		for (int i = 0; i < walletDTOs.length; i++) {
		WalletDTO ref=walletDTOs[i];
		
		if(ref!=null) {
			String fig=ref.getCompanyName();
			System.out.println(fig);
			if(name.equals(fig)) {
				System.out.println("name found:");
				return true;
			}
			else {
				System.out.println("name not found:");
			}
			
		}
		}
		
		
		return true;
	}
	
	public WalletDTO[] getwalletDTOs() {
		return  walletDTOs;
	}
	}
