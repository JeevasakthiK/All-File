package com.handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Windows {

	public static void main(String[] args) throws AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[.='Gmail']"));
		Actions a = new Actions(driver);
		a.contextClick(gmail).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parent_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) {
			if (id.equals(all_id)) {
				continue;
			}
			else {
				System.out.println(".........");
				driver.switchTo().window(id);
			}
		}
		

	}

}
