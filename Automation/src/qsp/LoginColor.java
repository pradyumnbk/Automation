package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginColor 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)
     {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.name("login")).getCssValue("background-color");
		String font = driver.findElement(By.name("login")).getCssValue("font-family");
		System.out.println(font);
		System.out.println(color);
		driver.close();
     }

}
