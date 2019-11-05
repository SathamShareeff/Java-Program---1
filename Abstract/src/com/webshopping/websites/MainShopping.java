package com.webshopping.websites;
import java.util.Scanner;

public class MainShopping {

	public static void main(String[] args) {
		System.out.println("Whcih website you want to Shop on?");
		Scanner s =new Scanner(System.in);
		String name=s.next();
		ShoppingWebsites website=null;
		if(name.equalsIgnoreCase("Flipkart")){
			website=new FlipKart();
		}
		else if(name.equalsIgnoreCase("Amazon"))
		{
			website=new Amazon();
		}
		if(website!=null){
			website.login();
			website.addToCart();
			website.pay();
		}
		if(website instanceof FlipKart){
			FlipKart f = (FlipKart)website;
			f.bookMovieTickets();
		}
		else if(website instanceof Amazon){
			Amazon a = (Amazon)website;
			a.search();
		}
		else {
			System.out.println("Website not found");
		}
	}

}
