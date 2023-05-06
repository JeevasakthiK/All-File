package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com/");
		WebElement txt = driver.findElement(By.xpath("//h1[contains(text(),'Today')] "));
		String text = txt.getText();
		System.out.println(text);
		WebElement add = driver.findElement(By.xpath("//a[contains(text(),'Mai')] "));
		String text2 = add.getText();
		System.out.println("\n" + text2);
	}

}
