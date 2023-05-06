package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement prime = driver.findElement(By.xpath("//span[.='Prime']"));
		a.moveToElement(prime).perform();
		Thread.sleep(3000);

		prime.click();

	}

}
