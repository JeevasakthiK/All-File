package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement all = driver.findElement(By.xpath("//a[.='All Departments']"));
		a.moveToElement(all).perform();

		WebElement heat = driver.findElement(By.xpath("(//a[.='Heating & Cooling'])[1]"));
		a.moveToElement(heat).perform();

		WebElement air = driver.findElement(By.xpath("(//a[.='Air Conditioners'])[1]"));
		a.moveToElement(air).perform();

		WebElement port = driver.findElement(By.xpath("(//a[.='Portable Air Conditioners'])[1]"));
		port.click();
	}

}
