package com.xworkz.java.dao;


import com.xworkz.java.dto.MovieDTO;

public class MovieDAO {

	private MovieDTO[] movieDTO=new MovieDTO[5];
	private int count=0;
	
	public void create(MovieDTO movieDTO) {
		System.out.println("create method invoked:");
		if(count<this.movieDTO.length && movieDTO!=null) {
			this.movieDTO[count++]=movieDTO;
			System.out.println("create:".concat(movieDTO.getActor()));
		}else {
			System.err.println("create invalid");
		}
	}
	
	public void save(MovieDTO movieDTO,int digit) {
		System.out.println("overloading is inovked");
		if(digit<this.movieDTO.length && movieDTO!=null) {
			this.movieDTO[digit]=movieDTO;
			System.out.println("overloading:".concat(String.valueOf(digit).concat("  ")).concat(movieDTO.getName()));
		}else {
			System.err.println("overloading is invalid");
		}
	}
	
	public void indexOccupied() {
		System.out.println("index:"+count);
	}
	
	public boolean search(String name) {
		System.out.println("search method invoked");
		for (int i = 0; i < movieDTO.length; i++) {
			MovieDTO ref=movieDTO[i];
			if(ref!=null) {
				String fig=ref.getDirector();
				System.out.println(fig);
				if(fig.equals(name)) {
					System.out.println("name found:"+name);
					return true;
				}else {
					System.err.println("name not found:"+name);
				}
			}
		}
		return false;
	}
	
	public MovieDTO[] getMovieDTO() {
	return movieDTO;	
	}
	
}
