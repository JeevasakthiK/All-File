package org.sof;

public class Automation {
	
	private void junitFramework() {
		System.out.println("Junit");
	}
	private void testngFramework() {
		System.out.println("TestNG");
	}
	private void cucumberFramework() {
		System.out.println("Cucumber");
	}
	public static void main(String[] args) {
		System.out.println("***Automation***");
		Automation a = new Automation();
		a.junitFramework();
		a.testngFramework();
		a.cucumberFramework();
		
	}

}
