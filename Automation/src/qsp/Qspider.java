package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider 
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
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("qspiders");
		List<WebElement> Alllinks = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		int count=Alllinks.size();
		System.out.println(count);
		for (WebElement link : Alllinks) 
		{
			String text = link.getText();
			System.out.println(text);
		}
		Alllinks.get(count-1).click();
		driver.close();
	}

}
