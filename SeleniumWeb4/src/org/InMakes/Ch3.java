package org.InMakes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/india-ka-furniture-studio-store?fm=neo%2Fmerchandising&iid=M_f8940833-e2fb-4bdf-8417-988f63c63e94_1_372UD5BXDFYS_MC.Q6I8NGK1VUG9&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Home~Home%2BFurnishings_Q6I8NGK1VUG9&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&cid=Q6I8NGK1VUG9");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement hme = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		hme.click();
		Thread.sleep(3000);
		WebElement bath = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		a.moveToElement(bath).perform();
		
	}

}
