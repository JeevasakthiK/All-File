package org.stepdefinition;

import org.base.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Baseclass {
	@Before
	private void precondition() {
		launchBrowser();
		maxi();
	}

	@After
	private void postcondition() {
		Close_tab();
	}
}
