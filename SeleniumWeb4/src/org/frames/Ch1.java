package org.frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		driver.switchTo().frame("login_page");
		WebElement contBtn = driver.findElement(By.xpath("//a[.='CONTINUE']"));
		contBtn.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		
		
		
	}

}
