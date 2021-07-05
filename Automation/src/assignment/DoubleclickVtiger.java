package assignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickVtiger 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the title which u want to check");
		Scanner sc=new Scanner(System.in);
		String expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement resourcetab = driver.findElement(By.id("navbarDocumentation"));
		Actions a=new Actions(driver);
		a.moveToElement(resourcetab).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[1]")).click();
		WebElement readfullstory = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(readfullstory).perform();
		String currenttitle = driver.getTitle();
		System.out.println(currenttitle);
		if(currenttitle.equals(expectedtitle))
		{
			System.out.println("hacker earth page is displayed");
		}
		else
		{
			System.out.println("hacker earth page is not displayed");
		}
		driver.close();
		
	}

}
