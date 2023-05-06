
Package org.rajini;

public class SuperOne {
	public void dob() {
		System.out.println("Rajinikanth born was 12th dec 1950");
		System.out.println("Rajini is an actor producer and screenwritter");
	}
	public void first() {
		System.out.println("Rajini first film is Aboorva ragangal");
	}
	public static void main(String[] args) {
	 SuperOne R = new SuperOne();
	 R.dob();
	 R.first();
	}
}






package org.rajini;

import org.rajini.String;
import org.rajini.SuperOne;
import org.rajini.SuperStar;

public class SuperStar extends SuperOne {
	public void award() {
		System.out.println("Rajini has won National award");
		System.out.println("He got seven Tamil Nadu State award");

	}
	public void family() {
		System.out.println("wife name latha");
		System.out.println("Daughters name Aishwarya and sowndarya");

	}
	public void salary() {
		System.out.println("Rajini salary is above 50cr ");
		System.out.println("His next upcoming film is Jailer");
	}
public static void main(String[] args) {
	SuperStar S = new SuperStar();
	S.dob();
	S.first();
	S.award();
	S.family();
	S.salary();
	
}
}


