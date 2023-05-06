package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement mob = driver.findElement(By.xpath("//span[.='Mobile & Accessories']"));
		a.moveToElement(mob).perform();
		
		WebElement topSel = driver.findElement(By.xpath("//span[.='Top Selling Wearables']"));
		topSel.click();
		
	}

}
