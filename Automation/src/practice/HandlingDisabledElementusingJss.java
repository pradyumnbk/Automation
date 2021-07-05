package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElementusingJss 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PRADYUMN/Desktop/disabled.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		JavascriptExecutor j=(JavascriptExecutor) driver;
	    String jss="document.getElementById('t2').value='manager'";
	    j.executeScript(jss);
	}

}
