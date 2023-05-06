package org.scanEx;

import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter From Staion :");
		String fromStation = sc.nextLine();
		System.out.println("From Station is " + fromStation);

		System.out.println("Enter To Station :");
		String toStation = sc.nextLine();
		System.out.println("To Station is " + toStation);

		System.out.println("Enter Ticket Price : ");
		float ticketPrice = sc.nextFloat();
		System.out.println("Ticket Price is " + ticketPrice);

		System.out.println("Enter Food Price :");
		float foodPrice = sc.nextFloat();
		System.out.println("Food Price is " + foodPrice);

		System.out.println("Enter travel Cost :");
		float travelCost = sc.nextFloat();
		System.out.println("Travel Cost is " + travelCost);

		System.out.println("Enter Hotel Rent : ");
		float hotelRent = sc.nextFloat();
		System.out.println("Hotel Rent is " + hotelRent);

	}

}
