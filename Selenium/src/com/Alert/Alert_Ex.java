package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btn1.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		WebElement btn2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		btn2.click();
		WebElement btn3 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btn3.click();
		Thread.sleep(2000);
		Alert alert2= driver.switchTo().alert();
		alert2.dismiss();
		WebElement btn4 = driver.findElement(By.xpath("(//a[contains(text(),'Textbox')])"));
		btn4.click();
		WebElement btn5 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		btn5.click();
		Alert alert3 = driver.switchTo().alert();
		String text = alert3.getText();
		System.out.println(text);
		alert3.sendKeys("Jeevasakthi");
		alert3.accept();
		
		
		
		
		
	}

}
