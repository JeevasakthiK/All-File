package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		int a =10;
		int b =0;
		int c;
		int d =5;
		int h =5;
		int n;
		try {
			c=a/b; // Arithmetic Exception				
		} catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.err.println("Error Occured");
		}
		
		n=d*h;
		System.out.println(n);
		//String s= null;//Null Pointer Exception
		//System.out.println(s.length());
		//Scanner sc =new Scanner(System.in);
		//int nextInt = sc.nextInt();//InPut Mismatch Exception
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		//IndexOutOf Bounds Exception
		//Integer integer = l.get(3);
		//System.out.println(integer);
		
		//String s ="abc";
		//String Index out of bounds Exception
		//System.out.println(s.charAt(3));
		
		int arr[]= {1,2,3,4};
		//Array index out of bounds Exception
		//System.out.println(arr[5]);
		
		String s ="abc123";
		//NumberFormat Exception
		//int parseInt = Integer.parseInt(s);
		
		
		
	}

}
