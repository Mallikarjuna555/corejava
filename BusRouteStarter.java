package com.xworkz;

import com.xworkz.java.BusRouteAssociation;
import com.xworkz.java.BusRouteDAO;
import com.xworkz.java.BusRouteDTO;
import com.xworkz.java.CrudBusRouteDAO;

public class BusRouteStarter {

	public static void main(String[] args) {

		// Integer id, String source, String destination, String driverName
		BusRouteDTO busRouteDTO = new BusRouteDTO(5, "bangalore", "davanagere", "robert");

		BusRouteDAO crudBusRouteDAO = new CrudBusRouteDAO();

		BusRouteAssociation association = new BusRouteAssociation(crudBusRouteDAO);

		association.save(busRouteDTO);
		association.findByName(busRouteDTO);
		association.displayAllDetails();

	}

}
