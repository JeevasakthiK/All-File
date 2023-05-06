package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_Name;
	
	@FindBy (xpath = "//input[@id='last_name']")
	private WebElement last_Name;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cc_No;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cc_Type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement exp_Month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exp_Year;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_No;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_Now;

	public Book_Hotel(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_No() {
		return cc_No;
	}

	public WebElement getCc_Type() {
		return cc_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_Year() {
		return exp_Year;
	}

	public WebElement getCvv_No() {
		return cvv_No;
	}

	public WebElement getBook_Now() {
		return book_Now;
	}
	
	

}
