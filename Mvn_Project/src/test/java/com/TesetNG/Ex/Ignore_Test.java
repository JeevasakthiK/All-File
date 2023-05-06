package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Ignore_Test {
	@Test
	private void one() {
		System.out.println("T- ONE");
	}

	@Test
	private void two() {
		System.out.println("T- TWO");
	}

	@Test(enabled = false)
	private void three() {
		System.out.println("T- THREE");
	}

	@Test(enabled = false)
	private void four() {
		System.out.println("T- FOUR");
	}
}
