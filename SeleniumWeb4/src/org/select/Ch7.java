package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ch7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='jeevasakthi2404'", user);

		WebElement pwd = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value='jeev@2404'", pwd);

		WebElement lgBtn = driver.findElement(By.xpath("//input[@type='Submit']"));
		js.executeScript("arguments[0].click()", lgBtn);

		WebElement locat = driver.findElement(By.id("location"));

		Select s = new Select(locat);
		List<WebElement> options = s.getOptions();
		for (WebElement list : options) {
			System.out.println(list.getText());
		}
	}

}
