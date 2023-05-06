package org.jScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement course = driver.findElement(By.xpath("//h4[.='Digital Marketing ']"));
		js.executeScript("arguments[0].scrollIntoView(true)", course);
		
	}

}
