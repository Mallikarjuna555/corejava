package com.xworkz.java;

import com.xworkz.java.dao.DoctorDAO;
import com.xworkz.java.dto.DoctorDTO;

public class DoctorDTOStarter {

	public static void main(String[] args) {
		
		//(String name, String specialization, String hospitalName, String gender, int salary, int age)
		DoctorDTO doctorDTO=new DoctorDTO("finch","ear","fortis","male",65000,32); //0 index
		DoctorDTO doctorDTO1=new DoctorDTO("warner","leg","appollo","male",85000,35);//1 index
		DoctorDTO doctorDTO2=new DoctorDTO("smith","eye","jayadeva","male",75000,33);
		
		DoctorDAO doctorDAO=new DoctorDAO();
		doctorDAO.create(doctorDTO); //0 index
		doctorDAO.create(doctorDTO1, 2);// 1 index
		doctorDAO.indexoccupied();
		doctorDAO.search("appollo");
		
		DoctorDTO[] ref=doctorDAO.getDoctorDTO();
		for (int i = 0; i < ref.length; i++) {
			DoctorDTO fig=ref[i];
			System.out.println("~~~~~~~~~~~~~~~");
			if(fig!=null) {
				System.out.println("name:"+fig.getName());
				System.out.println("hospital:"+fig.getHospitalName());
				System.out.println("gender:"+fig.getGender());
				System.out.println("age:"+fig.getAge());
				System.out.println("salary:"+fig.getSalary());
				System.out.println("special in:"+fig.getSpecialization());
			}else {
				System.err.println("null");
			}
		}

	}

}
