package com.scrn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement find = driver.findElement(By.name("q"));
		find.sendKeys("Laptop");
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File place = new File("\\Users\\dell\\eclipse-workspace\\Selenium\\Snap\\flip.png");
		FileUtils.copyFile(screenshotAs, place);
		
		String attribute = find.getAttribute("type");
		System.out.println(attribute);
		
	}

}
