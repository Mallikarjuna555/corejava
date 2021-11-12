package com.xworkz.java;

import com.xworkz.NewsPaper;

public class NewsPaperStarter {

	public static void main(String[] args) {
		
		NewsPaper newsPaper=new NewsPaper("vijayvani","kannada");
		NewsPaper newsPaper1=new NewsPaper("vijayvani","kannada");
		System.out.println(newsPaper.equals(newsPaper1));
	}
}
