package practice;

import org.openqa.selenium.WebDriver;

public class Demo 
{
	public static void test(WebDriver driver) 
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://web.whatsapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
