package org.company.simproject;

abstract class AbstractSim {

	abstract void internet();
	abstract void services();

	void call(){
		System.out.println("1G Service");
	}
	void sms(){
		System.out.println("Analog sms");
	}

}
