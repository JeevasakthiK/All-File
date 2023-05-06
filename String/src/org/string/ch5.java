package org.string;

import java.util.Scanner;

public class ch5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Inmakes Address :");
		String address = sc.nextLine();
		System.out.println("Address : "+address);
		if (address.contains("682019")) {
			System.out.println("Valid Address");
			
		}
		System.err.println("Invalid Address");
	}
}
