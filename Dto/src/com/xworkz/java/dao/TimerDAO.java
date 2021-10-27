package com.xworkz.java.dao;

import com.xworkz.java.dto.TimerDTO;

public class TimerDAO {

	private TimerDTO[] timerDTOs = new TimerDTO[5];
	private int count = 0;

	public void create(TimerDTO timerDTO) {
		System.out.println("create method invoked:");
		if (count < this.timerDTOs.length && timerDTO != null) {
			this.timerDTOs[count++] = timerDTO;
			System.out.println("create:".concat(timerDTO.getBrand()));
		} else {
			System.err.println("create invalid");
		}
	}

	public void save(TimerDTO timerDTO, int digit) {
		System.out.println("overloading method invoked:");
		if (digit < this.timerDTOs.length && timerDTO != null) {
			this.timerDTOs[digit] = timerDTO;
			System.out.println("save:".concat(String.valueOf(digit)));
		} else {
			System.out.println("overloading is invalid:");
		}
	}

	public void indexOccupied() {
		System.out.println("index:" + count);
	}

	public boolean search(String name) {
		System.out.println("search invoked:");
		for (int i = 0; i < timerDTOs.length; i++) {
			TimerDTO ref = timerDTOs[i];
			if (ref != null) {
				String fig = ref.getBrand();
				System.out.println(fig);
				if (fig.equals(name)) {
					System.out.println("name found:");
				} else {
					System.out.println("name not found");
				}
			}
		}

		return false;

	}
	
	public TimerDTO[] getTimerDTOs(){
		return timerDTOs;
	}
}
