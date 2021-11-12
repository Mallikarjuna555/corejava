package com.xworkz.java;

import java.lang.reflect.Method;

import com.xworkz.Speaker;

public class SpeakerStarter {

	public static void main(String[] args) {
		
		Speaker speaker=new Speaker();
		
		Class clazz=speaker.getClass();
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getTypeName());
		System.out.println(clazz.getCanonicalName());
		System.out.println(clazz.getModifiers());
	//	System.out.println(clazz.getAnnotatedSuperclass());
		
		Method[] methods=clazz.getMethods();
		System.out.println(methods.length);
		for (int i = 0; i < methods.length; i++) {
			Method ref=methods[i];
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getDefaultValue());
		System.out.println(ref.getParameterCount());
		
		}
	}

}
