package com.looping;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		System.out.println("Enter any number :");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter The number is :"+num);
		if (num%2==0) {
			System.out.println("The number is Even ");
		} else {
			System.out.println("The number is odd ");

		}
		
	}

}
