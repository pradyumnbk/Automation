package assignment;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionUnique 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PRADYUMN/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alloptioncls = s.getOptions();
		int count = alloptioncls.size();
		HashSet<String> c =new HashSet<String>();
		System.out.println(count);
		for (int i=0;i<count;i++)
		{
			String text=alloptioncls.get(i).getText();
			c.add(text);
		}
		for (String option :c)
		{
			System.out.println(option);
		}
		driver.close();
	}

}
