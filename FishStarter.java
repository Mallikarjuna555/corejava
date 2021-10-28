package com.xworkz.java;

public class FishStarter {

	public static void main(String[] args) {
		
		SharkFish sharkFish=new SharkFish();
		
		Fish fish=new Fish("kundapur",true);
		
		System.out.println(fish.location);
		System.out.println(fish.alive);
		
		GoldFish goldFish=new GoldFish("green");
		
	
	}
}
