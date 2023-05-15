package com.asst;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[10];
		int i=0;
		
			while(n!=0) {
			a[i++]=n%2;
			n=n/2;
			}
		
		for(i=i-1; i>=0;i--) {
		System.out.print(a[i]);	
		}

	}

}
