package com.javaScriptEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Js_Ex {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement lang = driver.findElement(By.xpath("//a[.='தமிழ்']"));
		js.executeScript("arguments[0].scrollIntoView()", lang);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].scrollIntoView()", email);
		js.executeScript("arguments[0].value='abc@gmail.com'", email);
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", btn);
		
		
	}

}
