package com.xworkz.java;

import com.xworkz.java.dto.BraceletDTO;

public class Starter {

	public static void main(String[] args) {
		
		BraceletDTO bracelet=new BraceletDTO();
		bracelet.setColour("gold");
		bracelet.setGemUsed(false);
		bracelet.setGifted(false);
		bracelet.setMaterial("silver");
		bracelet.setPrice(150.0f);
		
		BraceletDTO braclet1=new BraceletDTO("gold","silver",150.5f,false,true);
		BraceletDTO braclet2=new BraceletDTO("iron","silver",150.5f,false,true);
		BraceletDTO braclet3=new BraceletDTO("gold","silver",150.5f,false,true);
		BraceletDTO braclet4=new BraceletDTO("gold","silver",150.5f,false,true);
		
		BraceletDTO[] ref=new BraceletDTO[5];
		ref[0]=braclet1;
		ref[1]=braclet2;
		ref[2]=braclet3;
		
		for (int i = 0; i < ref.length; i++) {
			BraceletDTO fig=ref[i];
		if(fig!=null) { 
		System.out.println(fig.getColour());
		System.out.println(fig.getMaterial());
		System.out.println(fig.getPrice());
		System.out.println(fig.isGemUsed());
		System.out.println(fig.isGifted());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		}else {
			System.err.println("index is pointing to null".concat(String.valueOf(i)));
		}
	}
		
	}

}
