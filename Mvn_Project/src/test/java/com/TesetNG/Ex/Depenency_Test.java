package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Depenency_Test {

	@Test
	private void one() {
		System.out.println("T- ONE");
	}

	@Test(dependsOnMethods = "one")
	private void two() {
		System.out.println("T- TWO");
	}

	@Test
	private void three() {
		System.out.println("T- THREE");
	}

	@Test(dependsOnMethods = "two")
	private void four() {
		System.out.println("T- FOUR");
	}

}
