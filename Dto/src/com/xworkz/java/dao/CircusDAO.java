package com.xworkz.java.dao;

import com.xworkz.java.dto.CircusDTO;

public class CircusDAO {
	
	private CircusDTO[] circusDTO=new CircusDTO[5];
	private int digit=0;
	
	public void save(CircusDTO dto) {
		System.out.println("save method invoked");
		if(digit<this.circusDTO.length && dto!=null) {
			this.circusDTO[digit++]=dto;
			System.out.println("save:".concat(dto.getOwner()));
		}else {
			System.err.println("save:");
		}
	}
	
	public void create(CircusDTO dto,int index) {
		System.out.println("create method invoked");
		if(index<this.circusDTO.length  && dto!=null) {
			this.circusDTO[index]=dto;
			System.out.println("creat:".concat(String.valueOf(index)));
		}else {
			System.err.println("crete:");
		}
	}
	
	public void occupiedIndex() {
		System.out.println(digit);
	}
	
	public boolean search(String name) {
		System.out.println("search:");
		
		for (int i = 0; i < circusDTO.length; i++) {
			CircusDTO ref=circusDTO[i];
			
			if(ref!=null) {
				String fig=ref.getOwner();
				System.out.println(fig);
				
				if(fig.equals(name)) {
					System.out.println("name found:");
					return true;
				}else {
					System.out.println("name not found:");
				}
			}
			
		}
	return false;	
	}

	public CircusDTO[] GetcircusDTO() {
		return circusDTO;
	}
}
