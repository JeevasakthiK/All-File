package com.looping;

public class Sum_Odd {
		public static void main(String[] args) {
			int odd=0;
			System.out.println("Odd number from 1 to 100");
			System.out.println("___________________________");
		
			for (int i=0; i <=100; i++) {
				if (i%2 !=0) {
					odd=odd+i;
					System.out.println(i);
				}					
			}
			System.out.println("____________________________");
			System.out.println("sum of ODD number is "+odd);
			System.out.println("____________________________");
			
		}
	}
		







