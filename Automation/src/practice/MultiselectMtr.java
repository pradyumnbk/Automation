package practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectMtr 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRADYUMN/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		int count=alloption.size();
		Thread.sleep(3000);
		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(3000);
			s.selectByIndex(i);
		}
		Thread.sleep(3000);
		for (int j=count-1 ;j>0 ;j--)
		{
			Thread.sleep(3000);
			s.deselectByIndex(j);
		}
		driver.close();
	}

}
