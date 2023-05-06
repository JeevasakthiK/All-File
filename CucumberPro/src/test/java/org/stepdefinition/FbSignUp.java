package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.fbSign;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignUp extends BaseClass {
	fbSign f = new fbSign();

	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() throws InterruptedException {
		launchBrowser();
		maxi();

	}

	@When("To launch the url of fb")
	public void to_launch_the_url_of_fb() throws InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		

	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement crtBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		crtBtn.click();

	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(io.cucumber.datatable.DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		value(f.getFirstname(), l.get(2));
	}

	@When("To pass surname in surname box")
	public void to_pass_surname_in_surname_box(io.cucumber.datatable.DataTable d) {

		List<List<String>> l = d.asLists();
		value(f.getLastname(), l.get(0).get(2));
	}

	@When("To pass mob or email in email box")
	public void to_pass_mob_or_email_in_email_box(DataTable d) {
		Map<Object, Object> m1 = d.asMap(String.class, String.class);
		value(f.getEmail(), (String) m1.get("Email1"));

	}

	@When("To create new password in new password box")
	public void to_create_new_password_in_new_password_box(io.cucumber.datatable.DataTable d) {
		List<Map<Object, Object>> m2 = d.asMaps(String.class, String.class);
		value(f.getNewPwd(), (String) m2.get(0).get(2));

	}
	
	@Then("To close the browser")
	public void to_close_the_browser() {
	  crunt_tab();

	}
}
