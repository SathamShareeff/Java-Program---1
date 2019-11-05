package com.comp.associtation.car;

public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("Color of the Car = " +(c.color="Red"));
		System.out.println("Price of the Car = "+(c.price=150000));
		c.seatingCapacity=5;
		c.e=new Engine();
		
		c.e.cc=200;
		System.out.println("Brand of the Engine = "+(c.e.brand="Yamaha"));
		c.e.makeOfYear=2018;
		c.e.p=new Piston();
		
		System.out.println("No of Cyclinders in Piston"+(c.e.p.noOfCyclinders=4));
		
		System.out.println("------");
		c.e.p.pump();
	}

}
