package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch13 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement sigIn = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		a.moveToElement(sigIn).perform();
		
		WebElement selAct = driver.findElement(By.xpath("//span[.='Your Seller Account']"));
		selAct.click();
	}

}
