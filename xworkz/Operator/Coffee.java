package com.xworkz.Operator;

public class Coffee {

	private String[] brandNames=new String[3];
	public int price;
	private int temp=0;
	
	public Coffee(int price) {
		this.price=price;        
		System.out.println("constructor called:");	
	}
	
	public void brandNames(String names) {
		if(temp<this.brandNames.length) {
		this.brandNames[temp++]=names;
		System.out.println("create method invoked:".concat(names));
	}else {
	System.out.println("array is full");	
	}
	}
	
	public String[] getBrandNames() {
		return this.brandNames;
	}
	
	public void delete(int index) {
		if(index<this.brandNames.length && this.brandNames.length>=0) {
		this.brandNames[index]=null;
		System.out.println("delete method invoked:".concat(String.valueOf(index)));
		}
	}
	
	public void update(int index,String name) {
		if(index<this.brandNames.length && this.brandNames.length>=0) {
			this.brandNames[index]=name;
			System.out.println("delete method invoked:".concat(String.valueOf(index)).concat(String.valueOf(name)));
		}
	}
}
