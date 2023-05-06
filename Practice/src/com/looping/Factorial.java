package com.looping;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact =1l;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		long num= sc.nextLong();
		System.out.println("The number is:"+num);
		for (int i = 1; i <=num; i++) {
			fact = fact*i;	
			System.out.println(fact);
		}
		System.out.println("The factorial of "+num+" is " +fact);
		
	}

}
