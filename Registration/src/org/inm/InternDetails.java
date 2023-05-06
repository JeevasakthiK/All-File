package org.inm;

public class InternDetails {
	private void internName() {
		System.out.println("Name      : Jeeva");
	}
	private void internDob() {
		System.out.println("DOB       : 24/04/1992");
	}
	private void internEducation() {
		System.out.println("Education : B.TECH-IT");
	}
	private void internPhone() {
		System.out.println("Mobile NO : 9677783073");
	}
	private void internEmail() {
		System.out.println("Email ID  : jeevasakthi2404@gmail.com");
	}
	private void internGender() {
		System.out.println("Gender    : Male");
	}
	private void internAddress() {
		System.out.println("Address   : SALEM");

	}
	public static void main(String[] args) {
		InternDetails d = new InternDetails();
		d.internName();
		d.internDob();
		d.internEducation();
		d.internPhone();
		d.internEmail();
		d.internGender();
		d.internAddress();
	}

}
