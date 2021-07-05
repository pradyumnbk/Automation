package assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserUsingIterator 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
			String pwh = itr.next();
			String cwh = itr.next();
			driver.switchTo().window(cwh);
			Thread.sleep(3000);
			driver.close();
			driver.switchTo().window(pwh);
			Thread.sleep(3000);
			driver.close();
	}

}
