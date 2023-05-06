package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ch10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		
		boolean mul = s.isMultiple();
		System.out.println(mul);
		
		s.selectByIndex(1);
		s.selectByVisibleText("Grape");
		
		List<WebElement> options = s.getOptions();
		for (WebElement list : options) {
			System.out.println(list.getText());
			
		}
		String text = s.getFirstSelectedOption().getText();
		System.out.println("First Selected option : "+ text);
		
	}

}
