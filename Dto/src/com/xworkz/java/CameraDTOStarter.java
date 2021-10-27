package com.xworkz.java;

import com.xworkz.java.dao.CameraDAO;
import com.xworkz.java.dto.CameraDTO;

public class CameraDTOStarter {

	public static void main(String[] args) {
		
		CameraDTO cameraDTO=new CameraDTO();
		cameraDTO.setCompany("NIKON");
		cameraDTO.setCost(45000.0f);
		cameraDTO.setBatteryCapacity(4000.0f);
		cameraDTO.setPixel(125);
		cameraDTO.setType("DSLR");
		cameraDTO.setWeight(1.2f);
		
		CameraDTO cameraDTO1=new CameraDTO("CANON","DSLR1",135,55000.0F,5000.0f,1.5f);
		CameraDTO cameraDTO2=new CameraDTO("NIKON2","DSLR2",135,55000.0F,5000.0f,1.5f);
		CameraDTO cameraDTO3=new CameraDTO("FUJIFILM","DSLR3",135,55000.0F,5000.0f,1.5f);
		CameraDTO cameraDTO4=new CameraDTO("sony","DSLR4",135,55000.0F,5000.0f,1.5f);
		
		CameraDAO cameraDAO=new CameraDAO();
		cameraDAO.save(cameraDTO4);
		cameraDAO.save(cameraDTO1);
		cameraDAO.save(cameraDTO2);

		cameraDAO.delete(1);
		cameraDAO.update(0, cameraDTO4);
		
	CameraDTO[] ref=cameraDAO.getDto();
	for (int i = 0; i < ref.length; i++) {
		CameraDTO fig=ref[i];
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		if(fig!=null) {
			System.out.println(fig.getCompany());
			System.out.println(fig.getBatteryCapacity());
			System.out.println(fig.getCost());
			System.out.println(fig.getPixel());
			System.out.println(fig.getType());
			System.out.println(fig.getWeight());
			
		}else {
			System.err.println("array is full");
		}
	}
		
		
	
	}

}
