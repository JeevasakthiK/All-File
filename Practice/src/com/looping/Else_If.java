package com.looping;

import java.util.Scanner;

public class Else_If {
	public static void main(String[] args) {
		System.out.println("Enter Your Age");
		System.out.println("==============");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		System.out.println("Your age is "+age);
		if (age>=18 && age <=39) {
			System.out.println("You are eligible for Vote");
			System.out.println("***Adult***");
			
		}
		else if (age>=40 && age<=59) {
			System.out.println("You are eligible for Vote");
			System.out.println("***Midle Age Adult***");
		}
		else if (age>=60) {
			System.out.println("You are eligible for Vote");
			System.out.println("***Senior Adult***");
			
		}
		else if (age>=13 && age<18) {
			System.out.println("You are not eligible for Vote");
			System.out.println("***Teen Age***");
			
		}
		else {
			System.err.println("Your not eligble");
			
		}
		
	}

}
