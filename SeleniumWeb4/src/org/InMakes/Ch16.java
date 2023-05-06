package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch16 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver); 
		
		Thread.sleep(3000);
		
		WebElement elct = driver.findElement(By.xpath("(//div[.='Electronics'])[1]"));
		a.moveToElement(elct).perform();
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("realme");
		Thread.sleep(3000);
		
	}

}
