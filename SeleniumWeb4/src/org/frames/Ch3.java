package org.frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement conBtn = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		conBtn.click();
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
	}

}
