package com.actitme.genriclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectrepositorylib.HomePage;
import objectrepositorylib.Login;

/**
 * @author Vikraman
 */
public class BaseClass {
	public static WebDriver driver;
	public FileLib flib = new FileLib();
	public WebDriverCommonLib wait = new WebDriverCommonLib();

	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("connect to database");
	}

	@BeforeClass
	public void configBrowserBC() throws Throwable {
		String Browser = flib.getPropertyKeyValue("browser");
		if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void configLoginBM() throws Throwable {
		wait.waitForPageToLoad(driver);
		driver.get(flib.getPropertyKeyValue("url"));
		Login lp = PageFactory.initElements(driver, Login.class);
		lp.logInApp();

	}

	@AfterMethod
	public void configLogoutAM() {
		HomePage logOut = PageFactory.initElements(driver, HomePage.class);
		logOut.clickOnLogOut();
	}

	@AfterClass
	public void configCloseBrowserAC() {
		driver.close();
	}
}
