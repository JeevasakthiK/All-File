package org.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch1 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lh.inmakesedu.com/");

		// Step 1 typeCasting
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Step 2 use getScreenshotAs() method
		File img = ts.getScreenshotAs(OutputType.FILE);

		// Step 3 Create Destination file
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\SeleniumWeb4\\ScreenShot\\inm.png");

		// Step 4 CopyFile from temp folder to Destination folder
		FileUtils.copyFile(img, f);

	}

}
