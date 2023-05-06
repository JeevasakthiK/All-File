package com.looping;

public class Count_str {

	public static void main(String[] args) {
		String s ="Welcome to Greens";
		int count = 0 ;
		System.out.println("The given String is : "+s);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				count++;	
			}
		}
		System.out.println("Number of character in string is : "+count);
	}
}
