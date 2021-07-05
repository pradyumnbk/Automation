package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightFb 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)
     {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int HeightUn = driver.findElement(By.id("email")).getSize().getHeight();
		int HeightPwd = driver.findElement(By.id("pass")).getSize().getHeight();
		System.out.println(HeightUn);
		System.out.println(HeightPwd);
		if(HeightUn==HeightPwd)
		{
			System.out.println("Height of user name and passsword are same");
		}
		else
		{
			System.out.println("Height of user name and passsword are different");
		}
		driver.close();
	}

}
