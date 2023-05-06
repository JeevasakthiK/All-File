package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/home");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement course = driver.findElement(By.id("navbarDropdown"));
		a.moveToElement(course).perform();
		
		WebElement test = driver.findElement(By.xpath("//p[.='Software Testing Tamil']"));
		a.moveToElement(test).build().perform();
		
		WebElement master = driver.findElement(By.xpath("//a[.='ST Master Class']"));
		master.click();
	}

}
