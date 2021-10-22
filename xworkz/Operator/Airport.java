package com.xworkz.Operator;

public class Airport {

		private String[] airportNames=new String[5];
		private int temp=0;
		//create.read.delete.update
		
		public void airportNames(String name) {
			
			if(temp<this.airportNames.length) {
			this.airportNames[temp++]=name;
			System.out.println("create method invoked:".concat(name));
		} else {
			System.out.println("array is full");
		}
		}

			public String[] getAirportNames() {
				return this.airportNames;
			}
			
		public void delete(int digit) {
			if(digit<this.airportNames.length && this.airportNames.length>=0) {
			this.airportNames[digit]=null;
			System.out.println("delete method invoked:".concat(String.valueOf(digit)));
			}
			else {
				System.out.println("array full");
			}
		}
		
		public void update(int digit,String name) {
			if(digit<this.airportNames.length && this.airportNames.length>=0) {
				this.airportNames[digit]=name;
				System.out.println("update method invoked:".concat(String.valueOf(digit)).concat(String.valueOf(name)));
			}
			else {
				System.out.println("array is empty");
			}
		}
		
}

