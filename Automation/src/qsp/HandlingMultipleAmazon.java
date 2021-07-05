package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleAmazon 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		for (WebElement element : alllinks)
		{		
			String text = element.getText();
			System.out.println(text);	
		}
		driver.close();
	}


}
