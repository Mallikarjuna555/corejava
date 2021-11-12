package com.xworkz.java;

import com.xworkz.Watch;

public class WatchStarter {

	public static void main(String[] args) {

		Watch watch = new Watch("fastrack", 2000);
		System.out.println(watch.toString());
		System.out.println(watch.hashCode());

		Watch watch1 = new Watch("fastrack", 2000);
		System.out.println(watch.equals(watch1));

	}

}
