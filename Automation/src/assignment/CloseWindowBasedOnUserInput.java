package assignment;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowBasedOnUserInput 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the window which you want to close");
		Scanner sc=new Scanner(System.in);
		String expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("block")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
			String actualtitle = driver.getTitle();
			if (actualtitle.equals(expectedtitle)) 
			{
	          driver.close();
            }

		}
	}


}
