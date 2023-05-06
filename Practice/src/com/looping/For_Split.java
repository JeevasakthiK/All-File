package com.looping;

public class For_Split {

	public static void main(String[] args) {
		String str = "Software Testing Java";
		String str1 = "Software_Testing_Training";
		String[] split = str.split(" ");
		String[] split2 = str1.split("_", 2);
		for (String string : split) {
			System.out.println(string);
			
		}
		System.out.println("-------------");
		for (String string1 : split2) {
			System.out.println(string1);
			
		}
		

	}

}
