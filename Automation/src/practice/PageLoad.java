package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(13, TimeUnit.SECONDS);
		try
		{
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("page loaded within 13 seconds");
		}
		catch(Exception e)
		{
			System.out.println("page will not load within 13 seconds");
		}
		driver.close();
	}

}
