package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcNews 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		List<WebElement> Allnews = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count = Allnews.size();
		System.out.println(count);
		for (WebElement news : Allnews) 
		{
			System.out.println(news.getText());
		}
		driver.close();
	}
	

}
