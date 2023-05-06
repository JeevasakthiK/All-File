package com.looping;

import java.util.Scanner;

public class If_Ex {
	public static void main(String[] args) {
		System.out.println("Enter Your Age ");
		System.out.println("---------------");
		Scanner S = new Scanner(System.in);
		int age = S.nextInt();
		System.out.println("Your age is "+ age);
		if (age>=18) {
			System.out.println("So you are Eligible fo Vote");
		}
		else {
			System.out.println("So you are not Eligible for Vote");
		}
	}

}
