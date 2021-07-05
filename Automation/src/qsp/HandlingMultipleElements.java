package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRADYUMN/Desktop/Demo1.html");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		WebElement link = alllinks.get(0);
		String text = link.getText();
		System.out.println(text);
		driver.close();
	}

}
