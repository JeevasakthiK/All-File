package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.click();
		searchBar.sendKeys("iphone");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
	}

}
