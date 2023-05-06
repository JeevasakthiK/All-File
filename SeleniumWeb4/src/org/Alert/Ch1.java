package org.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement simAlert = driver.findElement(By.xpath("//a[.='Alert with OK ']"));
		simAlert.click();
		
		WebElement altBtn = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
		altBtn.click();
		
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		
	}

}
