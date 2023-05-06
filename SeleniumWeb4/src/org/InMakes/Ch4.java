package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement mob = driver.findElement(By.xpath("//a[.='Mobiles & More']"));
		a.moveToElement(mob).perform();
		Thread.sleep(3000);
		WebElement apple = driver.findElement(By.xpath("//a[.='Apple']"));
		a.moveToElement(apple);
		String text = apple.getText();
		System.out.println(text);
	}

}
