package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = -1)
	private void one() {
	System.out.println("T- ONE");
	}
	
	@Test(priority = 0)
	private void two() {
		System.out.println("T- TWO");	
	}
	
	@Test(priority = 1)
	private void three() {
		System.out.println("T- THREE");
	}
	
	@Test(priority = 2)
	private void four() {
		System.out.println("T- FOUR");
	}
}
