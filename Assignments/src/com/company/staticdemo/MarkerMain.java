package com.company.staticdemo;

public class MarkerMain {

	public static void main(String[] args) {
		
		System.out.println(Marker.brand);
		Marker m = new Marker("Red");
		System.out.println(m.color + " " + m.brand);
		Marker m2 = new Marker("Blue");
		System.out.println(m2.color + " " + m.brand);
		Marker m3 = new Marker(null);
		System.out.println(m3.color + " " + m3.brand);
		Marker m4 = new Marker("Purple");
		System.out.println(m4.color + " " + m4.brand);
		
	}

}
