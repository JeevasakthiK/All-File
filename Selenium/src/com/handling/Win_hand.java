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

public class Win_hand {

	public static void main(String[] args) throws AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement bs = driver.findElement(By.xpath("//a[.='Best Sellers']"));
		Actions a = new Actions(driver);
		a.contextClick(bs).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement cs = driver.findElement(By.xpath("//a[.='Customer Service']"));
		Actions b = new Actions(driver);
		b.contextClick(cs).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> all_id = driver.getWindowHandles();
		String expt_id = "https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help";
		for (String id : all_id) {
			if (driver.switchTo().window(id).getCurrentUrl().equals(expt_id)) {
				break;
				
			}
			
		}
	}

}
