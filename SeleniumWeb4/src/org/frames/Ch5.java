package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*30xkeg*_ga*MTgzMDcxOTY5Ni4xNjIwMDM5NDU0*_ga_SKB78GHTFV*MTYyODIzNDM4NC43Ny4xLjE2MjgyMzQ1MDQuMjc.&_ga=2.251599622.1054325332.1682286904-916408644.1682286904#");
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.id("DUMMY1"));
		user.sendKeys("jeeva2404");
		
		WebElement arr = driver.findElement(By.id("user-id-goahead"));
		arr.click();
		
		WebElement userId = driver.findElement(By.xpath("//input[@title='User Id']"));
		userId.sendKeys("jeeva2404");
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		pwd.sendKeys("password123");
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
		
	}

}
