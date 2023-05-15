package com.asst;

public class Ass_1 {

	public static void main(String[] args) {
		int a[][] = new int[10][];
		a[0] = new int[1];
		a[1] = new int[1];
		a[2] = new int[1];
		a[3] = new int[1];
		a[4] = new int[2];
		a[5] = new int[2];
		a[6] = new int[2];
		a[7] = new int[3];
		a[8] = new int[3];
		a[9] = new int[4];
		System.out.println(a[0]);
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				{
					k++;
					a[i][j] = k;
				}

			}}
			System.out.println("Array values are : ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);

			}
			System.out.println();

		}
	}

}
