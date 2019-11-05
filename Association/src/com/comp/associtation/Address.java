package com.comp.associtation;

public class Address {
	
	int doorNo;
	String streetName;
	String city;
	int pin;
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.name="Raj");
		System.out.println(s.age=25);
		System.out.println(s.color="Brown");
		
		s.addr=new Address();
		System.out.println(s.addr.doorNo=11);
		System.out.println(s.addr.streetName="BTM");
		System.out.println(s.addr.city="Bangalore");
		System.out.println(s.addr.pin=123456);
	}

}
