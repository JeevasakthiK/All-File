package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		WebElement frmStn = driver.findElement(By.id("from_station"));
		frmStn.sendKeys("Ernakulam");
		WebElement toStn = driver.findElement(By.name("to_station"));
		toStn.sendKeys("Salem");
		WebElement serBtn = driver.findElement(By.id("trainFormButton"));
		serBtn.click();
	}

}
