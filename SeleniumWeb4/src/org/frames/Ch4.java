package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("login_page");
		
		WebElement cusId = driver.findElement(By.xpath("//input[@type='text']"));
		cusId.sendKeys("jeeva2404");
		
		WebElement contBtn = driver.findElement(By.xpath("//a[.='CONTINUE']"));
		contBtn.click();
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.id("keyboard"));
		pwd.sendKeys("password123");
		
		WebElement logBtn = driver.findElement(By.id("loginBtn"));
		logBtn.click();		
		
	}

}
