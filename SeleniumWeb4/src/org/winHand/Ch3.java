package org.winHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");

		WebElement serBox = driver.findElement(By.id("headerSearch"));
		serBox.sendKeys("celling Fan");
		WebElement btn = driver.findElement(By.id("headerSearchButton"));
		btn.click();
		WebElement product = driver.findElement(By.xpath("//span[.='Hugger 52 in. LED Indoor Brushed Nickel Ceiling Fan with Light Kit']"));
		product.click();
		
		
		
	}

}
