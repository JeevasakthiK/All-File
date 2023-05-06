package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Invo_Test {
	@Test
	private void one() {
		System.out.println("T- ONE");
	}

	@Test(invocationCount = 2)
	private void two() {
		System.out.println("T- TWO");
	}

	@Test(invocationCount = 3)
	private void three() {
		System.out.println("T- THREE");
	}

	@Test(invocationCount = 4)
	private void four() {
		System.out.println("T- FOUR");
	}
}
