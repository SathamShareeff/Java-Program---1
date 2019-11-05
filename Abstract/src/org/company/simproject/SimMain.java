package org.company.simproject;
import java.util.Scanner;

public class SimMain {

	public static void main(String[] args) {		
		System.out.println("Enter the Sim Operator - ");
		Scanner s = new Scanner(System.in);
		String name=s.next();
		AbstractSim sim = null;
		if(name.equalsIgnoreCase("Airtel")){
			sim = new Airtel();
		}
		else if(name.equalsIgnoreCase("Jio")){
			sim=new Jio();
		}
		else if(name.equalsIgnoreCase("Vodafone")){
			sim=new Vodafone();
		}

		if (sim!=null){

			sim.internet();
			sim.services();
			sim.sms();
			sim.call();
		}
		else
		{
			System.out.println("No Sim Operators Found");
		}
	}	
}


