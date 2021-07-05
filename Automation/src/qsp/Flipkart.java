package qsp;//Question in whatsapp selenium group

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		
		List<WebElement> Alllinks = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		Thread.sleep(3000);
		int count = Alllinks.size();
		System.out.println(count);
		for (WebElement obj : Alllinks) 
		{
			String text = obj.getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		Alllinks.get(count-1).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
