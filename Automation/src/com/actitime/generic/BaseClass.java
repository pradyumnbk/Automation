package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void testOpenBrowser(String browser)
	{
		Reporter.log("open browser", true);

		if (browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	@AfterTest
	public void testCloseBrowser()	
	{
		Reporter.log("close browser", true);
		driver.close();
	}
	@BeforeMethod
	public void testLogin() throws IOException
	{
		Reporter.log("login", true);
		FileLib lib=new FileLib();
		String url = lib.getPropertyValue("url");
		String username = lib.getPropertyValue("un");
		String password = lib.getPropertyValue("pwd");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod
	public void testLogout()
	{
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
