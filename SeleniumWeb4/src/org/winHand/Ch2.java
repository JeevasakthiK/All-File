package org.winHand;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		WebElement searchBox = driver.findElement(By.id("inputValEnter"));
		searchBox.sendKeys("iphone 7");
		WebElement btn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btn.click();
		Thread.sleep(5000);
		WebElement product = driver.findElement(By.xpath(
				"//img[@src='https://n3.sdlcdn.com/imgs/k/h/q/230X258_sharpened/Spectacular-Ace-Black-Silicon-Soft-SDL872137273-1-6793f.webp']"));
		product.click();

		String parentID = driver.getWindowHandle();
		System.out.println("Parent Window ID :" + parentID);
		Set<String> allID = driver.getWindowHandles();
		System.out.println("All Window ID : " + allID);

		for (String winID : allID) {
			if (winID != parentID) {
				driver.switchTo().window(winID);
			}
		}
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.xpath("//span[.='add to cart']"));
		add.click();
		WebElement price = driver.findElement(By.xpath("(//span[.='Rs. 219'])[2]"));
		String text = price.getText();
		System.out.println("Product Price : " + text);

	}

}
