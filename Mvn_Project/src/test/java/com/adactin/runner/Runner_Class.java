package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", glue = "com.adactin.stepdefinition")

public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void start() {
		driver = new ChromeDriver();
		Base_Class.maxi(driver);

	}

	@AfterClass
	public static void end() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
