package org.string;

public class ch14 {
	public static void main(String[] args) {
		String s1 = "Jeeva";
		String s2 = "Jeeva";
		System.out.println("*** Litreal String ***");
		System.out.println("String 1        : " + s1);
		System.out.println("string 2        : " + s2);
		System.out.println("String 1 Memory : " + System.identityHashCode(s1));
		System.out.println("String 2 Memory : " + System.identityHashCode(s2));
	}
}
