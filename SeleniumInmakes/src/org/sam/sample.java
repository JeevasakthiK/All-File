package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumInmakes\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&ifkv=AQMjQ7SZ8U4r1nzCcEcARXxbZRWgL0UgdUTUfmSp_8sI0R7rKsU6DbTRbWQ5ng_grPz4RZNdBwiTpQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Current page Url : "+url);
		//driver.close();
		//driver.quit();
		
		
	}
}
