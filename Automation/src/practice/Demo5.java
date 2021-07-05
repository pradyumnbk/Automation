package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.close();
	}

}
