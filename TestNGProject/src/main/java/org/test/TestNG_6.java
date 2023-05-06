package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_6 {
	@Parameters("browser")
	@Test
	private void amazon(String browserName) {
		WebDriver driver;
		if (browserName.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		else if (browserName.equals("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
		driver.get("https://www.amazon.in/");
		WebElement sigIn = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		sigIn.click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("jeevasakthi2404@gmail.com");
		WebElement contBtn = driver.findElement(By.id("continue"));
		contBtn.click();
	}		


}
