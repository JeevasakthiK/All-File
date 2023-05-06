package org.Robot;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		
		WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement newAct = driver.findElement(By.xpath("//a[.='New to Flipkart? Create an account']"));
		a.moveToElement(newAct).perform();
		
		/*a.doubleClick(email).perform();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		*/
		
	}

}
