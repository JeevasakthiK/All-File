package org.scanEx;

import java.util.Scanner;

public class Scanner_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Intern Name :");
		String interName = sc.nextLine();
		System.out.println("Interns Name : "+interName);
		System.out.println("Enter Intern Age");
		int internAge = sc.nextInt();
		System.out.println("Intern Age : "+internAge);
		System.out.println("Enter Intern Phone NO :");
		long interPhoneNo = sc.nextLong();
		System.out.println("Intern PH No: "+interPhoneNo);
		sc.nextLine();
		System.out.println("Enter Intern Mail ID :");
		String interMail = sc.nextLine();
		System.out.println("Intern Mail ID : "+interMail);
		System.out.println("Enter Intern Address :");
		String internAddress = sc.nextLine();
		System.out.println("Intern Address : "+internAddress);
		System.out.println("Enter Intern Salary :");
		double interSalary = sc.nextDouble();
		System.out.println("Intern Salary : "+interSalary);
		
	}
	

}
