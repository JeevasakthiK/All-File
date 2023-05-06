package org.winHand;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone X");
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
		WebElement iphone = driver.findElement(By.xpath("//img[@alt='Apple iPhone 11 (64GB) - Black']"));
		iphone.click();
		String parentID = driver.getWindowHandle();
		System.out.println("Parent Window ID :"+parentID);
		Set<String> allID = driver.getWindowHandles();
		System.out.println("All Window ID : "+allID);
		
		for (String winID : allID) {
			if (winID!=parentID) {
				driver.switchTo().window(winID);
				
			}
				
		}
		WebElement cost = driver.findElement(By.xpath("(//span[.='₹40,999'])[2]"));
		String text = cost.getText();
		System.out.println("Product Cost : "+text );
	}

}
