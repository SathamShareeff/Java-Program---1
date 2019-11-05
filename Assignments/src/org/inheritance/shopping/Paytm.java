package org.inheritance.shopping;

public class Paytm extends Website {
	
	Paytm(String url, int ipAddress) {
		super(url,ipAddress);
	}

	void bookMovieTickets(){
		System.out.println("Paytm Book Movie Tickets");
	}

}
