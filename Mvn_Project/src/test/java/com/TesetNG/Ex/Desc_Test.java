package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Desc_Test {
	@Test
	private void one() {
		System.out.println("T- ONE");
	}

	@Test(description = "This is Second")
	private void two() {
		System.out.println("T- TWO");
	}

	@Test
	private void three() {
		System.out.println("T- THREE");
	}

	@Test(description = "This is Fourth")
	private void four() {
		System.out.println("T- FOUR");
	}

}
