package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Ex {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create.click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s =new Select(day);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(23);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		m.selectByValue("4");
		List<WebElement> months = m.getOptions();
		for (WebElement list : months) {
			System.out.println(list.getText());
		}
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1992");
		
		
		
		//driver.close();
	}

}
