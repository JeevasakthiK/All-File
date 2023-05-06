package com.looping;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		System.out.println("Enter Any 3dgit number :");
		Scanner Sc =new Scanner(System.in);
		int num = Sc.nextInt();
		int rem = 0;
		int sum = 0;
		int tem = num;
		System.out.println("Given Number is : "+num);
		while (tem>0) {
			rem = tem%10;
			sum = sum+(rem*rem*rem);
			tem = tem/10;
		}
		
		if (sum==num) {
			System.out.println("The Given No is Armstrong number");
		} else {
			System.out.println("The Given No is Not an Armstrong number");

		}
	}

}
