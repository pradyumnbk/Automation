package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> Alllinks = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = Alllinks.size();
		System.out.println(count);
		for (WebElement element : Alllinks) 
		{
			String text = element.getText();
			System.out.println(text);
		}
		//Thread.sleep(5000);
		Alllinks.get(count-1).click();
		//Thread.sleep(3000);
		driver.close();
	}

}
