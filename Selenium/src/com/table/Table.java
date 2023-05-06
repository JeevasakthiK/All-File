package com.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		WebElement cell = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[2]/td[3]"));
		System.out.println(cell.getText());
		System.out.println("----------------------");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[3]/td"));
		for (WebElement all : row) {
			System.out.println(all.getText());
		}
		System.out.println("----------------------");
		List<WebElement> colum = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[3]"));
		for (WebElement all : colum) {
			System.out.println(all.getText());	
		}
		System.out.println("----------------------");
		List<WebElement> all_data = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
		for (WebElement all : all_data) {
			System.out.println(all.getText());
			
		}
	}

}
