package com.xworkz.java;

import com.xworkz.java.dao.MovieDAO;
import com.xworkz.java.dto.MovieDTO;
import com.xworkz.java.dto.TimerDTO;

public class MovieDTOStarter {

	public static void main(String[] args) {
	//String name, String director, String actor, int rating, String producer
		MovieDTO movieDTO=new MovieDTO("KGf","prashanth neel","yash",9,"hombale");
		MovieDTO movieDTO1=new MovieDTO("mukunda murari","uppi","suddep",9,"geetam");
		MovieDTO movieDTO2=new MovieDTO("got","robert","emiiley clark",9,"star");
		
		MovieDAO movieDAO=new MovieDAO();
		movieDAO.create(movieDTO);
		movieDAO.save(movieDTO1, 2);
		movieDAO.indexOccupied();
		movieDAO.search("uppi");
		movieDAO.getMovieDTO();
		
		MovieDTO[] ref=movieDAO.getMovieDTO();
		for (int i = 0; i < ref.length; i++) {
			MovieDTO fig=ref[i];
			System.out.println("~~~~~~~~~~~~~~~");
			if(fig!=null) {
				System.out.println("name:"+fig.getName());
				System.out.println("actor:"+fig.getActor());
				System.out.println("director:"+fig.getDirector());
				System.out.println("producer:"+fig.getProducer());
				System.out.println("rating:"+fig.getRating());
				
			}else {
				System.err.println("null");
			}
		}
		

	}

}
