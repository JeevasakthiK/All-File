package com.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class New_Ex {

	public static void main(String[] args) {
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("-private");
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=2832210301338289443&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='nav-a']//following-sibling::a[@data-csa-c-type='nav_cs_5']"));
		
		findElement.click();
		
	}

	
}
