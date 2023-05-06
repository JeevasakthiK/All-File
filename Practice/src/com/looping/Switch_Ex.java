package com.looping;

import java.util.Scanner;

public class Switch_Ex {

	public static void main(String[] args) {
		System.out.println("Enter week day( Number 1 to 7 ):");
		System.out.println("**********************************");
		Scanner d = new Scanner(System.in);
		int day = d.nextInt();
		switch (day) {
		case 1:
			System.out.println("Day is Sunday");
			
			break;
		case 2:
			System.out.println("Day is Monday");
			break;
		case 3:
			System.out.println("Day is Tuesday");
			break;
		case 4:
			System.out.println("Day is Wednesday");
			break;
		case 5:
			System.out.println("Day is Thursday");
			break;
		case 6:
			System.out.println("Day is Friday");
			break;
		case 7:
			System.out.println("Day is Saturday");
			break;

		default:
			System.err.println("Enter number between 1 to 7");
			break;
		}
	}

}
