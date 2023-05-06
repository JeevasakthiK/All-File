package org.rajini;

public class SuperStar extends SuperOne {
			
	
		public void award() {
			System.out.println("--> Rajini has won National award");
			System.out.println("--> He got seven Tamil Nadu State award");

		}
		public void family() {
			System.out.println("--> His wife name latha");
			System.out.println("--> And Daughters name Aishwarya and sowndarya");

		}
		
		public void salary() {
			System.out.println("--> Rajini salary is above 50cr ");
			System.out.println("--> His next upcoming film is Jailer");
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
