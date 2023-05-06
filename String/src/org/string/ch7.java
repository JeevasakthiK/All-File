package org.string;

import java.util.Scanner;

public class ch7 {
	public static void main(String[] args) {
		System.out.println("Enter Mobile number");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length();
		System.out.println("Length of Given No: "+length);
			
		if (length==10) {
			System.out.println("Valid");
		}
		
		else
			System.err.println("Invalid");
			
		
	}
	}
	


