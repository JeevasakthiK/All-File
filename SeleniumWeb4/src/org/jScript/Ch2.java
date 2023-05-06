package org.jScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/selenium-training?q=banner");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement pgDwn = driver.findElement(By.xpath("//div[.='Recent Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(true)", pgDwn);
		
		Thread.sleep(2000);
		
		WebElement pgUp = driver.findElement(By.xpath("//div[contains(text(),'Enroll Now')]"));
		js.executeScript("arguments[0].scrollIntoView(false)", pgUp);
		
		
	}

}
