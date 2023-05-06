package com.looping;

import java.util.Scanner;

public class Palindrome_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = a;
		int rev = 0;
		while (a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if (b==rev) {
			System.out.println(b+" Is Palindrome number");	
		} 
		else {
			System.out.println(b+" Is not Palindrome number");
		}
	}
	}


