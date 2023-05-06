package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1342404752%3A1676310342248554&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcHpnRMlEAz6Wal6p6Ek-hCv7GBLGUjMhwwU1winrrfpGPrhkZlJ2YrYj5mkQnMHRNSXkWk");
		//Type 1 ==> attribute name and value present
		WebElement Email = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		Email.sendKeys("jkns200rider@gmail.com");
		Thread.sleep(5000);
		Email.clear();
		WebElement Email1 = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
		Email1.sendKeys("jeevasakthi2404@gmail.com");
		//Type 2 ==> no attribute name and value
		WebElement newAcc = driver.findElement(By.xpath("//span[text()='Create account']"));
		//newAcc.click();
		String text = newAcc.getText();
		System.out.println(text);
		WebElement forget = driver.findElement(By.xpath("//button[text()='Forgot email?']"));
		forget.click();
		driver.navigate().back();//stale element refresh exception
		//Type 3 ==> use contains function for text
		WebElement learn = driver.findElement(By.xpath("//div[contains(text(),'Not your computer?')]"));
		String text2 = learn.getText();
		System.out.println(text2);
		Email.clear();
		//use contains function for attributes and value
		WebElement Email2 = driver.findElement(By.xpath("(//input[contains(@aria-label,'or ')])[1]"));
		Email2.sendKeys("abc@gmail.com");
		
		
		

	}

}
