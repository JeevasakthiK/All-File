package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement all = driver.findElement(By.xpath("//a[.='All Departments']"));
		a.moveToElement(all).perform();
		
		WebElement paint = driver.findElement(By.xpath("(//a[.='Paint'])[1]"));
		a.moveToElement(paint).perform();
		
		WebElement intPaint = driver.findElement(By.xpath("//a[.='Interior Paint']"));
		a.moveToElement(intPaint).perform();
		
		WebElement celPaint = driver.findElement(By.xpath("//a[.='Ceiling Paint']"));
		celPaint.click();
	}

}
