package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDob 
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
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("English (UK)")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement DayListBox = driver.findElement(By.id("day"));
		WebElement MonthListBox = driver.findElement(By.id("month"));
		WebElement YearListBox = driver.findElement(By.id("year"));
		Select s=new Select(DayListBox);
		Select s1=new Select(MonthListBox);
		Select s2=new Select(YearListBox);
		s.selectByIndex(30);
		s.selectByValue("29");
		s.selectByVisibleText("29");
		s1.selectByIndex(7);
		s1.selectByValue("8");
		s1.selectByVisibleText("Aug");
		s2.selectByIndex(22);
		s2.selectByValue("1995");
		s2.selectByVisibleText("1995");
		Thread.sleep(3000);
		driver.close();
	}

}
