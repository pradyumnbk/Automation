package practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock 
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		System.out.println("enter the title ");
	Scanner sc=new Scanner(System.in);
	String expectedtitle=sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[contains(@class,'whsOnd ')])[1]")).sendKeys("barik.pradyumn0@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Barik@123");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	String actualtitle=driver.getTitle();
	if(expectedtitle.equals(actualtitle))
	{
	System.out.println("login successfully");
	}
	else
	{
	System.out.println("Invalid login:verify your username or password");
	}
	driver.close();
	}
}
