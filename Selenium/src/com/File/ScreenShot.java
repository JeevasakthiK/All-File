package com.File;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Samsung Mobiles");
		WebElement icon = driver.findElement(By.id("nav-search-submit-button"));
		icon.click();
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\Snap\\amzon.png");
		FileUtils.copyFile(screenshotAs, des);
		
		
		
	}

}
