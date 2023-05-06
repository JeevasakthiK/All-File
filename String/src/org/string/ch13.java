package org.string;

import java.util.Scanner;

public class ch13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		boolean equals = str1.equals(str2);
		System.out.println("String1 == String2 : "+equals);
	}

}
