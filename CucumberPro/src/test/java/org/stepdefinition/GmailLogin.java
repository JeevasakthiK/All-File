package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.gmailLog;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin extends BaseClass {
	gmailLog g = new gmailLog();

	@Given("To Launch the chrome browser and maximize window")
	public void to_Launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		maxi();
	}

	@When("To launch the url of gmail application")
	public void to_launch_the_url_of_gmail_application() throws InterruptedException {
		Thread.sleep(5000);
		launchUrl(
				"https://accounts.google.com/v3/signin/identifier?dsh=S2131056957%3A1682618750175859&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneECSPaI22-S99s57tAy9zAOcE1g3VZq86ZNYW0ki9iS6pNBpud91dSvfLbG0SBfnio9L5r0&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}

	@When("To pass valid mobile or email in username field")
	public void to_pass_valid_mobile_or_email_in_username_field() {
		value(g.getUsername(), "jeeva240492@gmail.com");

	}

	@When("To click next button")
	public void to_click_next_button() {
		click(g.getNxtBtn());

	}

	@When("To pass the password in password field")
	public void to_pass_the_password_in_password_field() {
		value(g.getPwd(), "password123");

	}

	@When("To click the next button")
	public void to_click_the_next_button() {
		click(g.getNxtBtn());
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		crunt_tab();
	}

	@Given("User Launch the browser and maximize window")
	public void user_Launch_the_browser_and_maximize_window() {
		launchBrowser();
		maxi();
	}

	@When("To launch the url of gamil")
	public void to_launch_the_url_of_gamil() {
		launchUrl(
				"https://accounts.google.com/v3/signin/identifier?dsh=S2131056957%3A1682618750175859&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneECSPaI22-S99s57tAy9zAOcE1g3VZq86ZNYW0ki9iS6pNBpud91dSvfLbG0SBfnio9L5r0&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

	@When("User pass the data {string} in username field")
	public void user_pass_the_data_in_username_field(String user) {
		value(g.getUsername(), user);
	}

	@When("User click the next button")
	public void user_click_the_next_button1() {
		click(g.getNxtBtn());
	}

	@When("user pass the data {string} in password field")
	public void user_pass_the_data_in_password_field(String pass) {
		value(g.getPwd(), pass);
	}

	@When("user click the next button")
	public void user_click_the_next_button() {
		click(g.getNxtBtn());

	}

	@Then("user close the close button")
	public void user_close_the_close_button() {
		crunt_tab();
	}

}
