package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTabActitime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String ptab = driver.getWindowHandle();
	    Set<String> alltabs = driver.getWindowHandles();
	   for (String tabs : alltabs) 
	   {
		   Thread.sleep(3000);
		   driver.switchTo().window(tabs);
		   if (!(ptab.equals(tabs)))
		   {
			   driver.close();
		   }
	   }
	   Thread.sleep(3000);
	   driver.switchTo().window(ptab);
	   driver.close();
	}

}
