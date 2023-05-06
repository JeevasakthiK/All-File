package com.looping;

public class String_functions {

	
	public static void main(String[] args) {
		String str = "Sotware Testing";
		String str1 ="Java";
		System.out.println(" * String Functions *");
		System.out.println("----------------------");
		System.out.println(""+str1+"-"+str);
		int length = str.length();
		System.out.println("Length : "+length);
		
		boolean equals = str1.equals("Java");
		System.out.println("Equals : "+equals);
		
		boolean equalsIgnoreCase = str.equalsIgnoreCase("software testing");
		System.out.println("EqualsIgnorecase : "+equalsIgnoreCase);
		
		String upperCase = str1.toUpperCase();
		System.out.println("UpperCase : "+upperCase);
		
		String lowerCase = str1.toLowerCase();
		System.out.println("LowerCase : "+lowerCase);
		
		boolean startsWith = str.startsWith("S");
		System.out.println("StartsWith : "+startsWith);
		
		boolean endsWith = str1.endsWith("A");
		System.out.println("EndsWith : "+endsWith);
		
		boolean contains = str.contains("ware");
		System.out.println("Contains : "+contains);
		
		int indexOf = str1.indexOf("a");
		System.out.println("IndexOf : "+indexOf);
		
		int lastIndexOf = str1.lastIndexOf("a");
		System.out.println("LastIndexOf : "+lastIndexOf);
		
		char charAt = str1.charAt(3);
		System.out.println("CharAt : "+charAt);
		
		String replace = str.replace("Testing", "Training");
		System.out.println("Replace : "+replace);
		
		String substring = str.substring(5);
		System.out.println("SubString : "+substring);
		
		String str2 = "";
		boolean empty = str2.isEmpty();
		System.out.println("Empty : "+empty);
		
		String str3 ="    Training";
		String trim = str3.trim();
		System.out.println("Trim : "+trim);
		
		int compareTo = str.compareTo(str1);
		System.out.println("CompareTo : "+compareTo);
		
	}


}
