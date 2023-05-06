package org.winHand;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		log.click();
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("Redmi Phone");
		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("(//img[@alt='REDMI 10 Power (Power Black, 128 GB)'])[1]"));
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
		WebElement price = driver.findElement(By.xpath("(//div[.='₹11,744'])[1]"));
		String text = price.getText();
		System.out.println("Price: "+text);

	}

}
