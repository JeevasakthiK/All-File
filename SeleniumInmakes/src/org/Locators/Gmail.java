package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("identifierId"));
		mail.sendKeys("jeevasakthi2404@gmail.com");
		
		WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtBtn.click();
	}

}
