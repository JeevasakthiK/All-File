package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class I_Frames {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame1);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Enter Text");
		driver.switchTo().defaultContent();
		WebElement btn = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		btn.click();
		WebElement out_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(out_frame);
		WebElement in_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(in_frame);
		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("Enter text");
		driver.switchTo().parentFrame();
	}

}
