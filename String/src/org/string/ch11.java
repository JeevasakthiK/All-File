package org.string;

import java.util.Scanner;

public class ch11 {
	public static void main(String[] args) {
		System.out.println("Enter Institute Name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Input  : "+name);
		System.out.println("Output : "+name.toLowerCase());
	}

}
