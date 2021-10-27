package com.xworkz.java;

import com.xworkz.java.dto.DressCodeDTO;
import com.xworkz.java.dao.DressCodeDAO;

public class DressCodeStarter {

	public static void main(String[] args) {
		
		DressCodeDTO dressCodeDTO=new DressCodeDTO();
		dressCodeDTO.setColour("red");
		dressCodeDTO.setGender(true);
		dressCodeDTO.setMaterial("nylon");
		dressCodeDTO.setPrice(655.0f);
		dressCodeDTO.setSize('m');
		
		DressCodeDTO dressCodeDTO1=new DressCodeDTO('s',"cotton","blue",850.0f,false);
		DressCodeDTO dressCodeDTO2=new DressCodeDTO('l',"fabric","green",850.0f,false);
		DressCodeDTO dressCodeDTO3=new DressCodeDTO('L',"wool","orange",850.0f,false);
		
		DressCodeDAO dressCodeDAO=new DressCodeDAO();
		dressCodeDAO.save(dressCodeDTO1);
		dressCodeDAO.save(dressCodeDTO2);
		dressCodeDAO.save(dressCodeDTO3);
		
		
		dressCodeDAO.update(2, dressCodeDTO1);
		
		DressCodeDTO[] ref=dressCodeDAO.getDto();
		for (int i = 0; i < ref.length; i++) {
			DressCodeDTO fig=ref[i];
			System.out.println("~~~~~~~~~~~~");
			
			if(fig!=null) {
				System.out.println(fig.getColour());
				System.out.println(fig.getMaterial());
				System.out.println(fig.getPrice());
				System.out.println(fig.getSize());
				System.out.println(fig.isGender());
			}else {
				System.err.println("array is full");
			}
		}

	}

}
