package org.string;

public class Ch15 {

	public static void main(String[] args) {
		String str = "Welcome To Java Class";
		System.out.println("Input  : "+str);
		String[] split = str.split(" ");
		System.out.println("\nOutput : ");
		for (String str2 : split) {
			System.out.println("\n          "+str2);
			
		}
	}

}
