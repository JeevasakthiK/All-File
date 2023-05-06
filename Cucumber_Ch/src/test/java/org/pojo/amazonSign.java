package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonSign extends Baseclass {

	private void amzon() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignBtn() {
		return signBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCtnBtn() {
		return ctnBtn;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy(id = "nav-link-accountList")
	private WebElement signBtn;

	@FindBy(id = "ap_email")
	private WebElement email;

	@FindBy(xpath = "//input[@aria-labelledby='continue-announce']")
	private WebElement ctnBtn;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(id = "nav-search-submit-text")
	private WebElement searchBtn;

}
