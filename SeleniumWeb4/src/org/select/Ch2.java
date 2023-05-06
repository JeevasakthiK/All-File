package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ch2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement newAcc = driver.findElement(By.xpath("//a[.='Create new account']"));
		newAcc.click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		for (WebElement list : options) {
			System.out.println(list.getText());
		}
		
	}

}
