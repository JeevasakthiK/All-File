package org.jScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='jeevasakthi2404@gmail.com'", email);
		
		Object text = js.executeScript("return arguments[0].value", email);
		System.out.println(text);
		
		WebElement pwd = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].value='password@123'", pwd);
		
		Object text1 = js.executeScript("return arguments[0].value", pwd);
		System.out.println(text1);
		
		WebElement lgBtn = driver.findElement(By.xpath("//button[.='Log in']"));
		js.executeScript("arguments[0].click()", lgBtn);
		
	}

}
