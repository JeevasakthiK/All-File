package com.Fb.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Fb.pom.Login_Page;
import com.base.Base_Class;

public class Runner_Class extends Base_Class {
	
	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incoginito");
		
		WebDriver driver = new ChromeDriver(options);
		
		maxi(driver);
		
		url(driver, "https://www.facebook.com/");
		
		Login_Page login = new Login_Page(driver);
		
		value(login.getEmail(),"abc@gmail.com");
		
		value(login.getPass(), "12345678");
		
		click(login.getBtn());
		
	}

}
