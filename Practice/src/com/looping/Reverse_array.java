package com.looping;

public class Reverse_array {
	public static void main(String[] args) {
		String head="Welcomes to Inmakes";
		String rev = " ";
		System.out.println("Given String is : "+head);
		char a[] =head.toCharArray();
		int len=a.length;
		for (int i = len-1; i >=0; i--) {
			rev=rev+a[i];	
		}
		System.out.println("Reverse String is :"+rev);
	}
}
