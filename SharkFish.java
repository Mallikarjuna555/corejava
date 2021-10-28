package com.xworkz.java;

public class SharkFish {

	float height;
	float weight;
	
	public SharkFish() {
		this(155.0f);
		System.out.println("no args sharkfish constructor invoked");
	}
	
	public SharkFish(float height) {
		System.out.println("SharkFish constructor invoked:"+height);
		
	}
}
