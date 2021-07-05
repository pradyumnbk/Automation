package assignment;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserExceptSpecific
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the title which you want to close");
		Scanner sc=new Scanner(System.in);
		String expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> Allwh = driver.getWindowHandles();
		for (String wh : Allwh) 
		{
			driver.switchTo().window(wh);
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
			if(!(expectedtitle.equals(actualtitle)))
			{
				driver.close();
			}
		}
		
	}

}
