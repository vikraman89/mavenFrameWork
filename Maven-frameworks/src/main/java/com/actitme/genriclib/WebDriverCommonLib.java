package com.actitme.genriclib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Vikraman
 *
 */
public class WebDriverCommonLib {
	/**
	 * it is used to wait for entire page to load,before perform action on
	 * element
	 * 
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * it is used to wait for element to appear in GUI, for every 500ms check
	 * for the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void WaitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	/**
	 * @param element
	 * @param option
	 */
	public void Select(WebElement element,String option){
		Select sel=new  Select(element);
		sel.selectByVisibleText(option);
	}

}
