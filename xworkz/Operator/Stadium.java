package com.xworkz.Operator;

public class Stadium {

	private String[] stadiumNames=new String[5];
	private int temp=0;
	
	public void stadiumNames(String names) {
		if(temp<this.stadiumNames.length) {
			this.stadiumNames[temp++]=names;
			System.out.println("create method:".concat(names));
		}
	}
	
	public String[] getStadiumNames() {
		return this.stadiumNames;
	}
	
	public void delete(int index) {
		if(index<this.stadiumNames.length && this.stadiumNames.length>=0){
			this.stadiumNames[index]=null;
		}
	}
	
	public void update(int index,String name) {
		if(index<this.stadiumNames.length && this.stadiumNames.length>=0){
			this.stadiumNames[index]=name;
		}
	}
}


