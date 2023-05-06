package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_Type;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_nos;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement check_In;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement check_out;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult_Room;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child_Room;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search_btn;

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}

	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

}
