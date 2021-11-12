package com.xworkz.java;

import com.xworkz.Fish;

public class FishStarter {

	public static void main(String[] args) {

		Fish fish = new Fish("star fish", 650);
		Fish fish1 = new Fish("star fish", 650);
		System.out.println(fish.equals(fish1));

	}

}
