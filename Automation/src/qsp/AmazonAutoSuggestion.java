package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		int count = allsuggestion.size();
		System.out.println(count);
		Iterator<WebElement> itr = allsuggestion.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		allsuggestion.get(count-1).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Spigen Ultra Hybrid TPU, PC Back Cover')])[1]")).click();
       Set<String> alltab = driver.getWindowHandles();
       Iterator<String> itr1 = alltab.iterator();
       String ptab = itr1.next();
       String ctab = itr1.next();
       driver.switchTo().window(ctab);
       driver.findElement(By.id("add-to-cart-button")).click();
       driver.findElement(By.id("nav-cart")).click();
	   //driver.close();
	}

}
