package org.fbLog;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLogin extends BaseClass{
	
	 public fbLogin() {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id="email")
	 private WebElement email;
	 
	 @FindBy(name="pass")
	 private WebElement pwd;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement logBtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}
	 
	 
}
