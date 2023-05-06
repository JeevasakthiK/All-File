package org.Robot;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch2 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Inmakes_infotech");
		a.doubleClick(search).perform();
	}

}
