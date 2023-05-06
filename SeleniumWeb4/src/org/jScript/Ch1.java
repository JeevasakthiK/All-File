package org.jScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		WebElement pageDown = driver.findElement(By.xpath("//p[contains(text(),'Inmakes offer various kinds')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", pageDown);
		
		String text = pageDown.getText();
		System.out.println("\n"+text);
		
	
	
	}

}
