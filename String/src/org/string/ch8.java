package org.string;

public class ch8 {

	public static void main(String[] args) {
		String str1 = "Welcome to Class Java";
		System.out.println("Input  : " + str1);
		String str2 = str1.replace("Java", "Sql");
		System.out.println("Output : " + str2);
		
		//challenge 9
		String str3 = "Inmakes Kochi";
		System.out.println("\nInput  : " + str3);
		String str4 = str3.replace("Kochi", "Chennai");
		System.out.println("Output : " + str4);
		
		//challenge 10
		String str5 = "Welcome To Java Class";
		System.out.println("\nInput : "+str5);
		String str6 = str5.replace(" ", "#");
		System.out.println("Output : "+str6);
	}

}
