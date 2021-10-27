package com.xworkz.java;

import com.xworkz.java.dao.WebSeriesDAO;
import com.xworkz.java.dto.WebSeriesDTO;

public class WebSeriesStarterDTO {

	public static void main(String[] args) {

		WebSeriesDTO webSeriesDTO = new WebSeriesDTO();
		WebSeriesDTO webSeriesDTO1 = new WebSeriesDTO("vampire daires", "albert", 150, 8.5f, 8, 8);
		WebSeriesDTO webSeriesDTO2 = new WebSeriesDTO("money hiest", "barlin", 150, 8.5f, 8, 8);
		WebSeriesDTO webSeriesDTO3 = new WebSeriesDTO("squid game", "nagu", 150, 8.5f, 8, 8);

		webSeriesDTO.setName("sacred games");
		webSeriesDTO.setCast("nawazuddin");
		webSeriesDTO.setCurrentSeason(2);
		webSeriesDTO.setNoOfCharacters(350);
		webSeriesDTO.setRating(6);
		webSeriesDTO.setTotalSeason(2);

		WebSeriesDAO webSeriesDAO = new WebSeriesDAO();
		webSeriesDAO.webSeriesNames(webSeriesDTO1);
		webSeriesDAO.webSeriesNames(webSeriesDTO2);
		webSeriesDAO.webSeriesNames(webSeriesDTO3);
		
		webSeriesDAO.delete(1);
		webSeriesDAO.update(1, webSeriesDTO2);

		WebSeriesDTO[] ref = webSeriesDAO.getDto();

		for (int i = 0; i < ref.length; i++) {
			WebSeriesDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~~~~~");
			if (fig != null) {
				System.out.println(fig.getCast());
				System.out.println(fig.getCurrentSeason());
				System.out.println(fig.getTotalSeason());
				System.out.println(fig.getRating());
				System.out.println(fig.getName());
				System.out.println(fig.getNoOfCharacters());
			} else {
				System.err.println("invalid");
			}
		}
	}

}
