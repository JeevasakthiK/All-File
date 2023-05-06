package org.inm;

public class internEducation extends InternDetail {
	private void ugDegree() {
		System.out.println("UG Degree : B.TECH-IT");
		
	}
	private void ugPercentage() {
		System.out.println("UG Percentage : 64% ");
		
	}
	public static void main(String[] args) {
		internEducation i = new internEducation();
		i.ugDegree();
		i.ugPercentage();
		i.internName();
		i.registeredInternship();
		i.internshipDuration();
	}

}
