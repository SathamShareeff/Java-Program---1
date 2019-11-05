package com.company.assignments;

import java.util.Scanner;

public class Burger {
	String brand="Mc-Donalds";
	int price;
	String type;
	boolean isChessy;
	void show(){
		System.out.println(" Brand "+this.brand+", price -  "+this.price+", type - "
				+this.type+", isChessy = "+this.isChessy);
	}
	
	Burger(String type)
	{
		this(120,type,true);
	}
	Burger(String type, boolean isChessy)
	{
		this(500,type,isChessy);
	}
	Burger(int price,String type,boolean isCheesy)
	{
		this.price=price;
		this.type=type;
		this.isChessy=true;
		this.show();
	}
	public static void main(String[] args) {
		
	Burger b = new Burger("Veg Burger");
	
	// b.show();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Price");
	b.price=s.nextInt();
	
	System.out.println("Enter the Type");
	b.type=s.next();
	s.next();
	System.out.println("If it is Chessy?");
	
	 b.isChessy=true;
	 b.isChessy=s.nextBoolean();
	 
	
	}
}
