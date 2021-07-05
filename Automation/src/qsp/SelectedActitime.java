package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedActitime
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean check = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(check);
		driver.close();
	}

}
