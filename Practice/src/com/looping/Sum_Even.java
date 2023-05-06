package com.looping;

public class Sum_Even {
		public static void main(String[] args) {
			int even=0;
			System.out.println("Even number from 1 to 100");
			System.out.println("___________________________");
		
			for (int i=1; i <=100; i++) {
				if (i%2 ==0) {
					even=even+i;
					System.out.println(i);
				}					
			}
			System.out.println("____________________________");
			System.out.println("sum of even number is "+even);
			System.out.println("____________________________");
			
		}
	}
		





