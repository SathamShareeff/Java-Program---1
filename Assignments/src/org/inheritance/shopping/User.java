package org.inheritance.shopping;
import java.util.Scanner;

public class User {
	Website purchase(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Website");
		String out=s.next();
		if(out.equalsIgnoreCase("Amazon")) 
				{
			return new Amazon("Amazon", 123);
		}
		else if(out.equalsIgnoreCase("Flipkart"))
				{
			return  new Flipkart("Flip", 004);
				}
		else if (out.equalsIgnoreCase("Paytm")){
			return new Paytm("Paytm",546);
		}
		else
			return null;
	}

}
