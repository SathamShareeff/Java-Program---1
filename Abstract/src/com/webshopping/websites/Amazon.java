package com.webshopping.websites;

public class Amazon extends ShoppingWebsites {

	@Override
	void pay() {
		System.out.println("Amazon pay override");
	}

	@Override
	void addToCart() {
		System.out.println("Amazon addToCart override");
	}
	void search(){
		System.out.println("Search item through Amazon");
	}

}
