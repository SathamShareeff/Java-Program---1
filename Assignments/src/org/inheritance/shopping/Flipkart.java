package org.inheritance.shopping;

public class Flipkart extends Website {

	Flipkart(String url, int ipAddress) {
		super("www.flip.com", 007);
	}

	void shopGiftCards(){
		System.out.println("Flipkart - purchase Gift Cards");
	}

}
