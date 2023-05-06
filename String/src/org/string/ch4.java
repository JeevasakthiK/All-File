package org.string;

import java.util.Scanner;

public class ch4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email ID ");
		String mail = sc.nextLine();
		System.out.println("Mail : " + mail);
		if (mail.contains("@")) {
			System.out.println("Valid email Id");
		} else
			System.err.println("Invalid email ID");

		// boolean con = mail.contains("@");
		// System.out.println("@ is Present ? : "+con);
		// System.out.println("Valid Email Id");
	}

}
