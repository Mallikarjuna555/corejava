package com.xworkz;

import com.xworkz.java.Enum.PlantType;

public class Plant {
	private String name;
	private boolean alive;
	private Integer lifeSpan;
	private PlantType type;

	public Plant() {
		System.out.println("no args cons invoked:");
	}

	public Plant(String name, boolean alive) {
		super();
		System.out.println("args cons invoked:");
		this.name = name;
		this.alive = alive;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked:");
		if (obj != null) {
			System.out.println("passed value is not null");
			if (obj instanceof Plant) {
				Plant casted = (Plant) obj;
				System.out.println("casted:");
				String ref = casted.getName();
				// boolean ref1=casted.isAlive();

				if (this.name.equals(ref)) {
					System.out.println("matching found:");
					return true;
				} else {
					System.out.println("mis match");
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
}
