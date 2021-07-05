package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		String expectedtitle = "naukri";
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		driver.quit();
		s.assertAll();
	}
}
