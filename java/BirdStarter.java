package com.xworkz;

import com.xworkz.java.BirdAssociation;
import com.xworkz.java.BirdDAO;
import com.xworkz.java.BirdDTO;
import com.xworkz.java.CrudBirdDAO;

public class BirdStarter {

	public static void main(String[] args) {
		
		//Integer id, String breed, Integer age, String origin, boolean canFly
		
		BirdDTO birdDTO=new BirdDTO(5,"indain peacock",20,"Asia",true);
		
		BirdDAO crudbirdDAO=new CrudBirdDAO();
		
		BirdAssociation association=new BirdAssociation(crudbirdDAO);
		
		association.save(birdDTO);
		association.findByOrigin(birdDTO);
		association.displayAllDetails();
	
	}

}
