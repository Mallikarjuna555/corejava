package com.xworkz.java;

import com.xworkz.java.dao.CircusDAO;
import com.xworkz.java.dto.CircusDTO;

public class CircusDTOStarter {

	public static void main(String[] args) {
		// (String owner, int ticketPrice, int noOfAnimals, int noOfShows, float
		// duration)

		CircusDTO circusDTO = new CircusDTO("elon musk", 500, 250, 4, 3.5f);
		CircusDTO circusDTO1 = new CircusDTO("jeff", 500, 250, 4, 3.5f);
		CircusDTO circusDTO2 = new CircusDTO("mark", 500, 250, 4, 3.5f);

		CircusDAO circusDAO = new CircusDAO();
		circusDAO.save(circusDTO);
		circusDAO.create(circusDTO2, 3);
		circusDAO.occupiedIndex();
		circusDAO.search("elon musk");

		CircusDTO[] ref = circusDAO.GetcircusDTO();
		for (int i = 0; i < ref.length; i++) {
			CircusDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~");
			if (fig != null) {
				System.out.println("owner name:" + fig.getOwner());
				System.out.println("duration:" + fig.getDuration());
				System.out.println("animals:" + fig.getNoOfAnimals());
				System.out.println("shows:" + fig.getNoOfShows());
				System.out.println("ticket:" + fig.getTicketPrice());
			} else {
				System.err.println("error");
			}
		}

	}

}
