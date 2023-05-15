package com.asst;

import java.util.Scanner;

public class FloyedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner in=new Scanner(System.in);
				int n=in.nextInt();
				
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						if((i%2)==(j%2))
						System.out.print("1");
						else
							System.out.print("0");
					}
				System.out.println();
				}
	}

}
