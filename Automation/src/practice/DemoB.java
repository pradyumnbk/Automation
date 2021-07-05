package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Enter the browser name");
		Scanner sc=new Scanner(System.in);
		String browser = sc.nextLine();
		if (browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("file:///C:/Users/PRADYUMN/Desktop/Demo1.html");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='https://www.qspiders.com/']")).click();
		driver.close();
	}

}
