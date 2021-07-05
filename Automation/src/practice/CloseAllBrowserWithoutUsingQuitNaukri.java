package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWithoutUsingQuitNaukri 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			driver.close();
		}
	}

}
