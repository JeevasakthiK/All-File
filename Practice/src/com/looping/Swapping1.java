package com.looping;

public class Swapping1 {

	public static void main(String[] args) {
		// swapping two numbers without using third variable
		int a=10;
		int b=20;
		System.out.println("Before Swapping a = "+a);
		System.out.println("Before Swapping b = "+b);
		System.out.println("-------------------------");
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("After Swapping a = "+a);
		System.out.println("After Swapping b = "+b);
		System.out.println("-------------------------");
		

	}

}
