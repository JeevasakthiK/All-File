package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("inmakes learning hub");
		WebElement link = driver.findElement(By.xpath("//span[.='Inmakes Learning Hub']"));
		link.click();

	}

}
