package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='check_all']")
	private WebElement select_All;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement cancel_btn;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout_btn;

	public Booked_Itinerary(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getSelect_All() {
		return select_All;
	}

	public WebElement getCancel_btn() {
		return cancel_btn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}
	

}
