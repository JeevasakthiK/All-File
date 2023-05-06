package org.Det;

public class InternsDetails {
	private void interns(String Name) {
		System.out.println("Interns Name : " + Name);

	}

	private void interns(int age) {
		System.out.println("Interns Age : " + age);
	}

	private void interns(long mobile) {
		System.out.println("Interns Mobile No : " + mobile);

	}

	public static void main(String[] args) {
		InternsDetails i = new InternsDetails();
		i.interns("Jeeva");
		i.interns(9677783073l);
		i.interns(29);
	}

}
