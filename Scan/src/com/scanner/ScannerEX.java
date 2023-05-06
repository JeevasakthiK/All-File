package com.scanner;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Details");
		System.out.println("==============");
		System.out.println("Entername:");
		String a = s.next();
		System.out.println("Name :"+a);
		
		s.nextLine();
		System.out.println("");
		System.out.println("Enter name with initial :");
		String b = s.nextLine();
		System.out.println("Full name :"+b);
		
		System.out.println("");
		System.out.println("Enter Door number");
		byte c = s.nextByte();
		System.out.println("D.No :"+c);
		
		System.out.println("");
		System.out.println("Enter the ID number");
		short d = s.nextShort();
		System.out.println("ID Number:"+d);
		
		System.out.println("");
		System.out.println("Enter the percentage");
		float f = s.nextFloat();
		System.out.println("Cgpa :"+f);
	}

}
