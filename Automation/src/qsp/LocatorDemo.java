package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo 
{
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRADYUMN/Desktop/Demo1.html");
		driver.findElement(By.tagName("a")).click();
	}

}
