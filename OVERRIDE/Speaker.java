package com.xworkz;

public class Speaker {
	
	public Speaker() {
		System.out.println("no args constructor invoked");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method invoked");
		super.finalize();
	}
	
	public void sound() {
	System.out.println("sound pa paaba bapa");
	}
	

}
