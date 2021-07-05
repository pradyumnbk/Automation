package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsAlphabeticalMtr//Example program to sort duplicate element according to alphabetical order
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
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<alloptioncls.size();i++)
		{
			String text = alloptioncls.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for (String option : al) 
		{
			System.out.println(option);
		}
		driver.close();
	}
}
