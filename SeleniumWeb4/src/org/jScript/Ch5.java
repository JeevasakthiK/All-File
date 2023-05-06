package org.jScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='jeevasakthi2404'", user);

		Object txt1 = js.executeScript("return arguments[0].value", user);
		System.out.println(txt1);

		WebElement pwd = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value='jeev@2404'", pwd);

		Object txt2 = js.executeScript("return arguments[0].value", pwd);
		System.out.println(txt2);

		WebElement lgBtn = driver.findElement(By.xpath("//input[@type='Submit']"));
		js.executeScript("arguments[0].click()", lgBtn);
	}

}
