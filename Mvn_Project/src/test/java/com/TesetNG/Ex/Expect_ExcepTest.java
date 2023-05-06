package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Expect_ExcepTest {
	@Test
	private void one() {
		System.out.println("T- ONE");
	}

	@Test
	private void two() {
		System.out.println("T- TWO");
	}

	@Test
	private void three() {
		System.out.println("T- THREE");
	}

	@Test(expectedExceptions = StringIndexOutOfBoundsException.class)
	private void four() {
		System.out.println("T- FOUR");
		throw new StringIndexOutOfBoundsException();
	}

}
