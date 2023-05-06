package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// direct locator using ID
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jeevasakthi2404@gamil.com");
		// using name locator
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("9043617617");

		WebElement logbtn = driver.findElement(By.name("login"));
		logbtn.click();

	}

}
