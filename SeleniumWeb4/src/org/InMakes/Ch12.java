package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement sigIn = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		a.moveToElement(sigIn).perform();
		
		WebElement reg = driver.findElement(By.xpath("(//a[.='Start here.'])[1]"));
		reg.click();
		
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Jeevasakthi");
		
		WebElement mob = driver.findElement(By.id("ap_phone_number"));
		mob.sendKeys("9677783073");
		
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("JEev@2404");
		
		WebElement cntBtn = driver.findElement(By.id("continue"));
		cntBtn.click();
	}

}
