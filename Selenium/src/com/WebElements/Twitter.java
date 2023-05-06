package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/v3/signin/identifier?dsh=S487147008%3A1676083625369744&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdot-l5Gx4YQr482qFKBiG8_7XOcsOScjOnjgdQAzIbbK2wI_d7Bunc1YZ0izMGrpDId8fi_w");
		d.manage().window().maximize();
		WebElement user = d.findElement(By.id("identifierId"));
		user.sendKeys("jeevasakthi2404@gmail.com");
		String tagName = user.getTagName();
		System.out.println(tagName);
		boolean displayed = user.isDisplayed();
		System.out.println(displayed);
		//String text = user.getText();
		//System.out.println(text);
		String attribute = user.getAttribute("type");
		System.out.println(attribute);
		//d.close();	
		
		

	}

}
