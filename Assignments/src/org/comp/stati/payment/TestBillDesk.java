package org.comp.stati.payment;

public class TestBillDesk {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.pay();
		
		System.out.println("---------");
		GoIBibo g = new GoIBibo();
		g.pay();
		
		System.out.println("---------");
		Bookipedia b = new Bookipedia();
		b.pay();
		
	}

}
