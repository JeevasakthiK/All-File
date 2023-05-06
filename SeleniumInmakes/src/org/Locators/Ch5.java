package org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firName.sendKeys("Jeevasakthi");
		WebElement lasName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lasName.sendKeys("K");
		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("Ram Nagar,Salem");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("jeevasakthi2404@gmail.com");
		WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("9677783073");
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement hob = driver.findElement(By.id("checkbox2"));
		hob.click();
		WebElement subBtn = driver.findElement(By.id("submitbtn"));
		subBtn.click();
		
		
		//driver.quit();
	}

}
