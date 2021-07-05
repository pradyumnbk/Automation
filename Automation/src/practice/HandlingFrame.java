package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PRADYUMN/Desktop/page1.html");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("j");
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("q");
		driver.switchTo().frame("f1");
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("s");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("s");
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("p");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("p");
		
	}

}
