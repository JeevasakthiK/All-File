package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.canarabank.in/?module=login");
		
		driver.switchTo().frame(2);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);

		WebElement logBtn = driver.findElement(By.xpath("//span[.='LOGIN']"));
		js.executeScript("arguments[0].click()", logBtn);
		
		
		
		
	}

}
