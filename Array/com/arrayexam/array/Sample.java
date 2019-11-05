package com.arrayexam.array;

public class Sample {

	public static void main(String[] args) {

		/*	String[] s= new String[4];
			System.out.println(s );
			
			for(String x:s){
				System.out.println(x);
			} 
			
			double[] d=new double[2];
			for(double i:d){
				System.out.println(i);
			}  */
			
			String[] s1= new String[3];
			for(String y:s1){
				System.out.println(y);
			}
			System.out.println("Before changing the Values");
			String[] names=new String[4];
			for (String z : names) {
				System.out.println(z);
			}
			names[0]="Alpha";
			names[1]="Beta";
			names[2]="Charlie";
			names[3]="Delta";
			
			System.out.println("After changing the values");
			for (String name : names) {
				System.out.println(name);
			}
			
	}

}
