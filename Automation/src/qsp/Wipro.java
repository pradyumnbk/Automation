package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro 
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
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("search wipro jobs"+Keys.ENTER);
			List<WebElement> Allurl = driver.findElements(By.xpath("//a"));
			int count = Allurl.size();
			System.out.println(count);
			for (WebElement url : Allurl) 
			{
				String text = url.getAttribute("href");
				System.out.println(text);
			}
		
		driver.close();


	}

}
