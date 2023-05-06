package org.scanEx;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name : ");
		String bankName = sc.nextLine();
		System.out.println("Bank Name : " + bankName);

		System.out.println("Enter Branch Name :");
		String branchName = sc.nextLine();
		System.out.println("Branch Name : " + branchName);

		System.out.println("Enter Customer Name :");
		String customerName = sc.nextLine();
		System.out.println("Customer Name : " + customerName);

		System.out.println("Enter Account Number :");
		long accountNumber = sc.nextLong();
		System.out.println("Account Number : " + accountNumber);

		System.out.println("Enter Saving balance amount :");
		double savingBalance = sc.nextDouble();
		System.out.println("Saving Balance : " + savingBalance);

		System.out.println("Enter Loan Amount :");
		float loanAmount = sc.nextFloat();
		System.out.println("Loan Amount : " + loanAmount);

	}

}
