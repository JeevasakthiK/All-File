package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbSign extends BaseClass {
	
	public fbSign() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement accBtn;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement email;
	
	@FindBy(id="password_step_input")
	private WebElement newPwd;

	public WebElement getAccBtn() {
		return accBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNewPwd() {
		return newPwd;
	}
	
	

}
