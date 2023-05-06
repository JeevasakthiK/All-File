package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	// WebDriver Methods
	public static void url(WebDriver d, String url) {
		d.get(url);
	}

	public static void maxi(WebDriver d) {
		d.manage().window().maximize();
	}

	public static void title(WebDriver d) {
		String title = d.getTitle();
		System.out.println(title);
	}

	public static void currentUrl(WebDriver d) {
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void crunt_tab(WebDriver d) {
		d.close();
	}

	public static void all_tab(WebDriver d) {
		d.quit();
	}

	// WebElement Methods
	public static void click(WebElement e) {
		e.click();
	}

	public static void value(WebElement e, String v) {
		e.sendKeys(v);
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}

	public static void text(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}

	public static void tagName(WebElement e) {
		String tagName = e.getTagName();
		System.out.println(tagName);

	}

	public static void atb_Name(WebElement e, String att) {
		String attribute = e.getAttribute(att);
		System.out.println(attribute);
	}

	// Select Methods

	public static void select_index(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
		//s.deselectByIndex(i);
	}

	public void select_value(WebElement e, String v) {
		Select s = new Select(e);
		s.selectByValue(v);
		//s.deselectByValue(v);

	}

	public void select_text(WebElement e, String v) {
		Select s = new Select(e);
		s.selectByVisibleText(v);
		//s.deselectByVisibleText(v);
	}

	public static void options(WebElement e) {
		Select s = new Select(e);
		List<WebElement> all_opt = s.getAllSelectedOptions();
		for (WebElement opt : all_opt) {
			System.out.println(opt.getText());
		}
	}

	public static void de_options(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	// Actions
	public static void moveTo(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.moveToElement(e).build().perform();
	}

	public static void click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();
	}

	public static void right_Click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();
	}

	public static void double_click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.doubleClick(e).build().perform();
	}

	// Robot
	public static void tab() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void up() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void right() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
	}

	public static void left() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
	}

	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// JavascriptExecutor
	public static void js_click(WebDriver d, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click()", e);

	}

	public static void scroll_page(WebDriver d, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoview()", e);
	}

	// TakeScreenshot
	public static void screenshot(WebDriver d, String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
	}

}
