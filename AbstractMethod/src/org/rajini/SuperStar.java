package org.rajini;

public class SuperStar extends SuperOne {
	@Override
	public void dob() {
		
		super.dob();
	}
	@Override
	public void first() {
		
		super.first();
	}
	@Override
	public void award() {
		System.out.println(" => Rajini has won National award");
		System.out.println(" => He got seven Tamil Nadu State award");
		
	}
	@Override
	public void family() {
		System.out.println(" => His wife name latha");
		
	}
	@Override
	public void salary() {
		System.out.println(" => Rajini salary is above 50cr");
		
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


