package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Group_Test {
	@Test(groups = "odd")
	private void one() {
		System.out.println("T- ONE");
	}

	@Test(groups = "even")
	private void two() {
		System.out.println("T- TWO");
	}

	@Test(groups = "odd")
	private void three() {
		System.out.println("T- THREE");
	}

	@Test(groups = "even")
	private void four() {
		System.out.println("T- FOUR");
	}

}
