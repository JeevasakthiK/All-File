package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.facebook.com/");
		WebElement email = D.findElement(By.id("email"));
		email.sendKeys("xyz@gmail.com");
		WebElement pwd = D.findElement(By.name("pass"));
		pwd.sendKeys("12345678");
		boolean displayed = pwd.isDisplayed();
		System.out.println(displayed);
		WebElement logbtn = D.findElement(By.name("login"));
		//logbtn.click();
		String text = logbtn.getText();
		System.out.println(text);
		boolean enabled = pwd.isEnabled();
		System.out.println(enabled);
		String attribute = pwd.getAttribute("type");
		System.out.println(attribute);
		String tagName = logbtn.getTagName();
		System.out.println(tagName);
		D.manage().window().minimize();
		
		D.close();
		
		

	}

	

}
