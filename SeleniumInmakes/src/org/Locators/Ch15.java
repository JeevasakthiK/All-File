package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement logBtn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		logBtn.sendKeys("9677783073");
		WebElement txt = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		String text = txt.getText();
		System.out.println(text);
	}

}
