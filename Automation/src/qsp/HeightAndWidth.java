package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int Width = driver.findElement(By.id("email")).getSize().width;
		int Height = driver.findElement(By.id("email")).getSize().height;
		System.out.println(Width);
		System.out.println(Height);
		driver.close();
	}

}
