package org.winHand;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		WebElement searchBox = driver.findElement(By.id("inputValEnter"));
		searchBox.sendKeys("Hand Sanitizer");
		WebElement btn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btn.click();
		Thread.sleep(3000);
		WebElement product = driver.findElement(By.xpath("//img[@title='ZERMERO -  Hand Sanitizer 100 mL (Pack of 6)']"));
		product.click();
		String parentID = driver.getWindowHandle();
		System.out.println("Parent Window ID :" + parentID);
		Set<String> allID = driver.getWindowHandles();
		System.out.println("All Window ID : " + allID);

		for (String winID : allID) {
			if (winID != parentID) {
				driver.switchTo().window(winID);
			}
		}
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.xpath("//span[.='add to cart']"));
		add.click();
	
	
	}

}
