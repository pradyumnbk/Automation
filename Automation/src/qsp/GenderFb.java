package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderFb 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		int Y1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int Y2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int Y3=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		System.out.println(Y1+" "+Y2+" "+Y3);
		if(Y1==Y2&& Y2==Y3 && Y3==Y1)
		{
			System.out.println("female,male and custom radio button are aligned");
		}
		else
		{
			System.out.println("male, female, custom radio button are not aligned");
		}
		driver.close();
	}

}
