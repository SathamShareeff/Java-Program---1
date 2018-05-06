package com.companyname.projectname.module;

public class For {
	
	int a=10;
	{
	for(a=0; a<=9;a++){
		System.out.println("Output - " +a);
		
	}
	}

	public static void main(String[] args) {

		For f = new For();
		System.out.println("Main Method -" +f.a);
	}

}
