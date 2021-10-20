package com.xworkz.java;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ref=5;
		Integer ref1=new Integer(7);
		int a=Integer.valueOf(ref).compareTo(Integer.valueOf(ref1));
		System.out.println(a);
		System.out.println(ref==ref1);
		
		char grade='B';
		Character section='C';
		Character y=new Character(grade);
		
		System.out.println(y.charValue());
		System.out.println(y.compareTo(section));
		System.out.println(y.equals(section));
		System.out.println(y.toString());
		System.out.println(y.hashCode());
		
	System.out.println("float");	
		float ab=45.0f;
		Float num=50.0f;
		
		Float n=new Float(ab);
		System.out.println(n.doubleValue());
		System.out.println(n.floatValue());
		System.out.println(n.isInfinite());
		System.out.println(n.equals(num));
		System.out.println(n.compareTo(num));
		
		short abc=12;
		Short def=166;
		
		Short ya=new Short(abc);
		System.out.println(ya.compareTo(def));
		System.out.println(ya.equals(def));
		System.out.println(ya.byteValue());
		System.out.println(ya.floatValue());
		System.out.println(ya.toString());
		
	
	System.out.println("byte");
		byte ghi=55;
		Byte jkl=65;
		
		Byte loud=new Byte(ghi);
		System.out.println(loud.compareTo(jkl));
		System.out.println(loud.doubleValue());
		System.out.println(loud.equals(jkl));
		System.out.println(loud.floatValue());
		System.out.println(loud.hashCode());
		
		boolean torch=false;
		Boolean torch1=new Boolean(torch);
		System.out.println(torch1.booleanValue());
		System.out.println(torch1.equals(torch));
		System.out.println(torch1.toString());
		System.out.println(torch1.getClass());
		System.out.println(torch1==torch);
		
		
		double m=1221.255;
		Double wrapD=533.656;
		Double double1=new Double(m);
		System.out.println(double1.compareTo(wrapD));
		System.out.println(double1.doubleValue());
		System.out.println(double1.equals(wrapD));
		System.out.println(double1.floatValue());
		System.out.println(double1.isInfinite());
		
	}
}
