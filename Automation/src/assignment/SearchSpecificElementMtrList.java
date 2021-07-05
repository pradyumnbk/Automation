package assignment;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificElementMtrList 
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
		System.out.println("enter the item you want to search");
		Scanner sc=new Scanner(System.in);
		String options=sc.nextLine();
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alloptions = s.getOptions();
		int count=0;
		for(int i=0;i<alloptions.size();i++)
		{
			String text = alloptions.get(i).getText();
			if(text.equals(options))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(options+" is not available");
		}
		else if (count==1)
		{
			System.out.println(options+" is available without duplicate");
		}
		else if(count>1)
		{
			System.out.println(options+" is available and is duplicate");
		}
		driver.close();
	}

}
