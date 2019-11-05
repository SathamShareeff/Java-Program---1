package org.inheritance.shopping;

public class ShopMain {

	public static void main(String[] args) {

		Amazon a = new Amazon("www.amazon.com",123);
		a.delivery();
		a.amazonPay();
		System.out.println("------------");

		Flipkart f = new Flipkart("www.flipkart.com",456);
		f.delivery();
		f.shop();
		f.shopGiftCards();
		
		System.out.println("---------");

		Paytm p = new Paytm("www.paytm.com",789);
		p.shop();
		p.delivery();
		p.bookMovieTickets();
		System.out.println("--------");

		User u = new User();
		u.purchase();
		
		Website w = new Website("www.webiste.com",123);
		w.delivery();
		w.shop();


	}

}
