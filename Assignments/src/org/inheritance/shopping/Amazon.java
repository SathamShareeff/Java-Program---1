package org.inheritance.shopping;

public class Amazon extends Website {
	Amazon(String url, int ipAddress) {
		super(url, ipAddress);
	}
	void amazonPay(){
		System.out.println("Amazon Pay");
	}
	@Override
	void delivery(){
		System.out.println("Amazon Delivery - Override");
	}

}
