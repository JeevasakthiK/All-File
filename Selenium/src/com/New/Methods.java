package com.New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://www.flipkart.com/");
		
		String title = drv.getTitle();
		System.out.println("Tittle ==> "+title);
		
		String currentUrl = drv.getCurrentUrl();
		System.out.println("CurrentUrl ==> " +currentUrl);
		
		drv.navigate().to("https://www.amazon.in/");
		drv.manage().window().minimize();
		String currentUrl1 = drv.getCurrentUrl();
		System.out.println("2nd Page ==> "+currentUrl1);
		
		drv.navigate().back();
		drv.navigate().forward();
		drv.navigate().refresh();
		drv.manage().deleteAllCookies();
		drv.close();
		

	}

}
