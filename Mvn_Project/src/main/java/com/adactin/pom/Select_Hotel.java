package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement select_btn;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_btn;

	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect_btn() {
		return select_btn;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}
	
	 

}
