package org.inheritance.shopping;

public class Website {

	String url;
	int ipAddress;

	void shop(){
		System.out.println("Shopping through Websites");
	}

	void delivery(){
		System.out.println("Website delivery - With the help of India post");
	}
	Website(String url,int ipAddress){
		this.url=url;
		this.ipAddress=ipAddress;
	}

}
