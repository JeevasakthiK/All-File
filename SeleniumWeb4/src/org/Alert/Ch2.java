package org.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement conAlert = driver.findElement(By.xpath("//a[contains(text(),'OK & Cancel')]"));
		conAlert.click();
		
		WebElement altBtn = driver.findElement(By.xpath("//button[contains(text(),'confirm box')]"));
		altBtn.click();
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		
	}

}
