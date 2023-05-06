package org.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement promAlert = driver.findElement(By.xpath("//a[.='Alert with Textbox ']"));
		promAlert.click();

		WebElement prmBtn = driver.findElement(By.xpath("//button[contains(text(),'prompt ')]"));
		prmBtn.click();

		Thread.sleep(3000);

		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Inmakes Infotech");
		a.accept();

	}

}
