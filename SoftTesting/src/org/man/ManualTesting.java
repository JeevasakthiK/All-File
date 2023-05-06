package org.man;

import org.aut.AutomationTesting;

public class ManualTesting extends AutomationTesting {
	private void regressionTesting() {
		System.out.println("Regression Testing");

	}

	private void reTesting() {
		System.out.println("ReTesting");

	}

	public static void main(String[] args) {
		ManualTesting m = new ManualTesting();
		m.regressionTesting();
		m.reTesting();
		m.softwareName();
		m.testngFramework();
		m.cucumberFramework();
	}
}
