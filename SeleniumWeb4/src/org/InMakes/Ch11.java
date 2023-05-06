package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(women).perform();
		
		WebElement heels = driver.findElement(By.xpath("//span[.='Heels']"));
		heels.click();
		
	}

}
