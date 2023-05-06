package com.kenzo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kenzo_ex {
	public static void main(String[] args) {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("incognito");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}
