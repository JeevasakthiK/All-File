package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement ele = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select fruit =new Select(ele);
		boolean multiple = fruit.isMultiple();
		System.out.println(multiple);
		fruit.selectByVisibleText("Mango");
		WebElement ele1 = driver.findElement(By.xpath("(//p[contains(text(),have )])[1]"));
		String text = ele1.getText();
		System.out.println(text);
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select heros = new Select(ele2);
		boolean multiple2 = heros.isMultiple();
		System.out.println(multiple2);
		heros.selectByIndex(3);
		Thread.sleep(2000);
		heros.selectByValue("bw");
		Thread.sleep(2000);
		heros.selectByValue("am");
		Thread.sleep(2000);
		heros.selectByValue("cm");
		Thread.sleep(2000);
		heros.selectByVisibleText("Iron Man");
		List<WebElement> all = heros.getAllSelectedOptions();
		System.out.println("-----------------------");
		System.out.println("Selected Super Heros : ");
		System.out.println("------------------------");
		for (WebElement selected : all) {
			System.out.println(selected.getText());	
		}
		Thread.sleep(2000);
		heros.deselectByIndex(4);
		heros.deselectByValue("cm");
		heros.deselectByVisibleText("Ant-Man");
		List<WebElement> all1 = heros.getAllSelectedOptions();
		System.out.println("--------------------");
		System.out.println("After Deselected : ");
		System.out.println("--------------------");
		for (WebElement selected1 : all1) {
			System.out.println(selected1.getText());
			
		}
		Thread.sleep(2000);
		heros.deselectAll();
			
		}
		
		
		
		
		
	}

