package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widthFb 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int WidthUn = driver.findElement(By.id("email")).getSize().getWidth();
		int WidthPwd=driver.findElement(By.id("pass")).getSize().getWidth();
		System.out.println(WidthUn);
		System.out.println(WidthPwd);
		if(WidthUn==WidthPwd)
		{
			System.out.println("width of username and password are same");
		}
		else
		{
			System.out.println("width of username and password are different");
		}
		driver.close();

	}

}
