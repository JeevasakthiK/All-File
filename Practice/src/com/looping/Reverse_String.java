package com.looping;

public class Reverse_String {

	public static void main(String[] args) {
		String head ="Welcome to greens";
		String rev ="";
		int len = head.length();
		System.out.println("Given String is : "+head);
		for (int i = len-1; i >=0; i--) {
			rev=rev+head.charAt(i);
			
		}
		System.out.println("Reverse String is : "+rev);

	}

}
