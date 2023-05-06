package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement bank = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement debAc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, debAc).build().perform();
		
		WebElement sale = driver.findElement(By.xpath("//a[.=' SALES ']"));
		WebElement salAc = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(sale, salAc).build().perform();
		Thread.sleep(3000);
		
		WebElement amt1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement debAmt  = driver.findElement(By.className("placeholder"));
		a.dragAndDrop(amt1, debAmt).build().perform();
		
		WebElement amt2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement crdAmt = driver.findElement(By.className("placeholder"));
		a.dragAndDrop(amt2, crdAmt).build().perform();
	}
	
	
	
	


}