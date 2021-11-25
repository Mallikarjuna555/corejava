package com.xworkz.java;

public class CrudBusRouteDAO implements BusRouteDAO {

	BusRouteDTO[] busRouteDTO = new BusRouteDTO[5];
	int counter = 0;

	@Override
	public boolean save(BusRouteDTO busRouteDTO) {
		System.out.println("save method invoked");
		if (counter < this.busRouteDTO.length && busRouteDTO != null) {
			this.busRouteDTO[counter++] = busRouteDTO;
			System.out.println("save method is valid");
		} else {
			System.err.println("save method is invalid");
		}
		return true;
	}

	@Override
	public void displayAllDetails() {

		for (int i = 0; i < busRouteDTO.length; i++) {
			BusRouteDTO ref = busRouteDTO[i];
			if (ref != null) {
				System.out.println(ref.getDestination());
				System.out.println(ref.getDriverName());
				System.out.println(ref.getSource());
				System.out.println(ref.getId());
			}

		}
	}

	@Override
	public BusRouteDTO findByName(String driverName) {
		System.out.println("search method invoked");
		for (int i = 0; i < busRouteDTO.length; i++) {
			BusRouteDTO ref = this.busRouteDTO[i];
			if (ref != null) {
				String res = ref.getDriverName();
				if (driverName.equals(res)) {
					System.out.println("search method valid");
				} else {
					System.out.println("search method invalid");
				}
			}
		}
		return null;
	}
}
