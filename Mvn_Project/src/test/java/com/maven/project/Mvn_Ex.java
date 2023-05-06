package com.maven.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mvn_Ex {

	public static void main(String[] args) throws AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement sell = driver.findElement(By.xpath("//a[.='Sell']"));
		Actions a = new Actions(driver);
		a.moveToElement(sell).build().perform();
		a.click().build().perform();
		
		
	}

}
