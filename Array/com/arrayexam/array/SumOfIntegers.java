package com.arrayexam.array;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many integers you want to store?");
		
		int size=s.nextInt();
		
		//creating an Array with the given Size
		int [] nums=new int[size];
		System.out.println(nums);
		//System.out.println(nums);
		
		//accepting the number from the User
		System.out.println("Enter the integer into the Array");
		for (int i = 0; i < nums.length; i++) {
			nums[i]=s.nextInt();
		}
		
		//Calculating the sum of integer in the Array
		
		int sum=0;
		for (int i : nums) {
			sum+=i;   // or sum= sum +1;
		}
		System.out.println("the total sum is " +sum);
		
	}

}
