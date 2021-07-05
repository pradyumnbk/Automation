package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp=new LoginPage(driver);
		lp.setValue("admin1", "manager1");
		Thread.sleep(3000);
		lp.setValue("admin", "manager");
		driver.close();
	}

}
