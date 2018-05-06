package com.commands.ifpractise.iftwo;

public class DoWhile {

	byte x=10;
	{
		do{
			x++;
			System.out.println(x);
		}while(x!=0);
	}
	public static void main(String[] args) {

		DoWhile d = new DoWhile();
		System.out.println("Output " +d.x);
	}

}
