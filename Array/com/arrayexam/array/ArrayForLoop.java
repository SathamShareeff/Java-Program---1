package com.arrayexam.array;

public class ArrayForLoop {

	public static void main(String[] args) {
		
		String[] subs={"Java","Manual","SQL"};
		
		System.out.println("Forward Direction");
		for (int i = 0; i <= subs.length-1; i++) {
			
		System.out.println(subs[i]);
	}
		System.out.println("\n\n\n");
		// In Reverse type
		
		System.out.println("Backward Direction");
		for (int i = subs.length -1;i>=0; i--) {
			
			System.out.println(subs[i]);
		}
	}

}
