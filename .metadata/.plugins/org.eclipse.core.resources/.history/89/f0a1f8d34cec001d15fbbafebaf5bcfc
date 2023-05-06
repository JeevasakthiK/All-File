package org.stepdefinition;

import java.util.List;

import org.base.Baseclass;
import org.pojo.amazonSign;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class AmazonSignIn extends Baseclass {

	amazonSign a = new amazonSign();

	@When("To launch the url of amazon")
	public void to_launch_the_url_of_amazon() throws InterruptedException {
		Thread.sleep(3000);
		launchBrowser();
		maxi();
		launch_Url("https://www.amazon.in/");
	}

	@When("To click the signIn button")
	public void to_click_the_signIn_button() throws InterruptedException {
		click_Btn(a.getSignBtn());
	}

	@When("To pass the valid username in username field")
	public void to_pass_the_valid_username_in_username_field() throws InterruptedException {
		
		value(a.getEmail(), "jeevasakthi2404@gmail.com");
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		click_Btn(a.getCtnBtn());
	}

	@Then("To Close the browser")
	public void to_Close_the_browser() {
		//Close_tab();
	}

	@When("To pass the product name in search box")
	public void to_pass_the_product_name_in_search_box(DataTable d) {
		List<String> l = d.asList();
		value(a.getEmail(), l.get(1));
	}

	@When("To click the search button")
	public void to_click_the_search_button() {
		click_Btn(a.getSearchBtn());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//Close_tab();
	}

	@When("To pass the data {string} in username field")
	public void to_pass_the_data_in_username_field(String s) {
		value(a.getSearchBox(), s);

	}

}
