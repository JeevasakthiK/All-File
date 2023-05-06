package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("jeevasakthi@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pwd.sendKeys("12345678");
		WebElement logBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		logBtn.click();
	}

}
