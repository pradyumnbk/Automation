package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA 
{
	public static void test(WebDriver driver)
	{
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
