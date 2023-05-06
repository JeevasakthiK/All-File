package com.looping;

public class Coun_Even {
public static void main(String[] args) {
	int n=100;
	int count=0;
	System.out.println("count of even number");
	System.out.println("********************");
	for (int i = 1; i <=n; i++) {
		if (i%2 ==0) {
			System.out.println(i);
			count= count+1;
		}	
	}
	System.out.println("count of even number from 1 to 100 is "+count);

}
}
