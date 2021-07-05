package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllSuggestion
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 11");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		List<WebElement> Allprod = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> Allprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div[1]/div[1]/div[1]"));
		int count = Allprice.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
			System.out.println(Allprod.get(i).getText()+"         "+Allprice.get(i).getText());
		}
		driver.close();
	}

}
