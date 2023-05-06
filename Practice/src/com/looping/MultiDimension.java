package com.looping;

public class MultiDimension {

	public static void main(String[] args) {
		int a[][]=new int[4][4];
		a[0][0]=05;
		a[0][1]=10;
		a[0][2]=15;
		a[1][0]=20;
		a[1][1]=25;
		a[1][2]=30;
		a[2][0]=35;
		a[2][1]=40;
		a[2][2]=45;
		a[3][0]=50;
		a[3][1]=55;
		a[3][2]=60;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
			
		}

		
	}

}
