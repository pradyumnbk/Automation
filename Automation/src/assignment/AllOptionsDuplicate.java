package assignment;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsDuplicate 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRADYUMN/Desktop/webpage/hotel.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement slvlistbox=driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		List<WebElement>alloptions=s.getOptions();
		HashSet<String> h=new HashSet<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			String text=alloptions.get(i).getText();
			if(h.add(text)==false)
			{
				System.out.println(text);
			}
		}
		driver.close();
	}
}

