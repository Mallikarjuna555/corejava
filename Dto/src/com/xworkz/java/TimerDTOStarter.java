package com.xworkz.java;

import com.xworkz.java.dao.TimerDAO;
import com.xworkz.java.dto.DoctorDTO;
import com.xworkz.java.dto.TimerDTO;

public class TimerDTOStarter {

	public static void main(String[] args) {
		
	//	boolean correctTime, boolean digital, int bell, String brand	
		TimerDTO timerDTO=new TimerDTO(true,false,5,"puma");
		TimerDTO timerDTO1=new TimerDTO(true,false,5,"nike");
		TimerDTO timerDTO2=new TimerDTO(true,false,5,"adidas");
		
		TimerDAO timerDAO=new TimerDAO();
		timerDAO.create(timerDTO);
		timerDAO.create(timerDTO1);
		timerDAO.save(timerDTO2, 1);
		timerDAO.indexOccupied();
		timerDAO.search("adidas");
		timerDAO.getTimerDTOs();
		
		TimerDTO[] ref=timerDAO.getTimerDTOs();
		for (int i = 0; i < ref.length; i++) {
			TimerDTO fig=ref[i];
			System.out.println("~~~~~~~~~~~~~~~");
			if(fig!=null) {
				System.out.println("name:"+fig.getBrand());
				System.out.println("bell:"+fig.getBell());
				System.out.println("digital:"+fig.isDigital());
				System.out.println("coorect tiime:"+fig.isCorrectTime());
				
			}else {
				System.err.println("null");
			}
		}
		
		

	}

}
