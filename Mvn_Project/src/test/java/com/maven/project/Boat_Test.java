package com.maven.project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.Base_Class;

public class Boat_Test extends Base_Class {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		maxi(driver);
		url(driver, "https://www.amazon.in/");
		WebElement all = driver.findElement(By.xpath("(//span[.='All'])[2]"));
		moveTo(driver, all);
		click(all);
		WebElement mob_com = driver.findElement(By.xpath("//div[.='Mobiles, Computers']"));
		moveTo(driver, mob_com);
		right_Click(driver,mob_com);
		right();
		enter();
		String parent_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) {
			if (id.equals(parent_id)) {
				continue;
			}else {
				
				driver.switchTo().window(id);
			}
		}
		currentUrl(driver);
		title(driver);
		Thread.sleep(5000);
		screenshot(driver,"C:\\Users\\dell\\eclipse-workspace\\Mvn_Project\\snap\\imge.png" );
		Thread.sleep(5000);
		all_tab(driver);
		
			

}
}