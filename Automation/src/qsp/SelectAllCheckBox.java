package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRADYUMN/Desktop/webpage/textbox.html");
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : allcheckbox) 
		{
			checkbox.click();
		}
	}
}
