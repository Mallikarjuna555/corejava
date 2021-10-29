package com.xworkz.java;

import com.xworkz.java.dao.LawyerDAO;
import com.xworkz.java.dto.LawyerDTO;

public class LawyerDTOStarter {

	public static void main(String[] args) {

//(String name, String qualification, int experience, String gender, int age, String courtType,
		// int caseWon, int caseLost)

		LawyerDTO lawerDTO = new LawyerDTO("mama", "BALLB", 10, "male", 55, "criminal", 50, 12); // 0

		LawyerDTO lawerDTO1 = new LawyerDTO("antony", "BA", 15, "male", 55, "criminal", 52, 12); // 1
		LawyerDTO lawerDTO2 = new LawyerDTO("cook", "LLB", 20, "male", 55, "criminal", 50, 12);// delete ,2
		LawyerDTO lawerDTO3 = new LawyerDTO("juliet", "BLLB", 30, "female", 55, "civil", 50, 12);

		LawyerDAO lawyerDAO = new LawyerDAO();

		lawyerDAO.save(lawerDTO);
		lawyerDAO.save(lawerDTO1);
		// lawyerDAO.create(lawerDTO,2);
		// lawyerDAO.create(lawerDTO1, 1);
		lawyerDAO.create(lawerDTO3, 2);
		lawyerDAO.delete(2);//
		lawyerDAO.search("antony");
		lawyerDAO.search(50);

		lawyerDAO.getQualifcationByName("antony");
		lawyerDAO.getLawyerWithMaxExperience();
		lawyerDAO.getExpByName("mama");

		LawyerDTO[] ref = lawyerDAO.getLawyerDTO();
		for (int i = 0; i < ref.length; i++) {
			LawyerDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~~~~");
			if (fig != null) {
				System.out.println("age:" + fig.getAge());
				System.out.println("case lost:" + fig.getCaseLost());
				System.out.println("case won:" + fig.getCaseWon());
				System.out.println("court type" + fig.getCourtType());
				System.out.println("gender:" + fig.getGender());
				System.out.println("name:" + fig.getName());
				System.out.println("qualification:" + fig.getQualification());
				;
			} else {
				System.err.println("array is full");

			}
		}

	}
}
