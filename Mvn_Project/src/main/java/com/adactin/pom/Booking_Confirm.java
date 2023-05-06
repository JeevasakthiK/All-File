package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement my_Itinerary;
	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement search_Hot;

	public static WebDriver getDriver() {
		return driver;
	}

	public Booking_Confirm(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMy_Itinerary() {
		return my_Itinerary;
	}

	public WebElement getSearch_Hot() {
		return search_Hot;
	}

}
