package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLog extends BaseClass {
	public gmailLog() {
		PageFactory.initElements(driver, this);	
}
	@FindBy(id="identifierId")
	private WebElement username;

	@FindBy(xpath="//span[.='Next']")
	private WebElement nxtBtn;
	
	@FindBy(name="Passwd")
	private WebElement pwd;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getNxtBtn() {
		return nxtBtn;
	}

	public WebElement getPwd() {
		return pwd;
	}

}
