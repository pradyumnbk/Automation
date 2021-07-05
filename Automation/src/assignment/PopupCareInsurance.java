package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopupCareInsurance 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
	    driver.findElement(By.id("dob")).click();
	    WebElement monthtextbox = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(monthtextbox);
		s.selectByVisibleText("Aug");
		WebElement yeartextbox = driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(yeartextbox);
		s1.selectByVisibleText("1995");
		driver.findElement(By.linkText("29")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8961044769");
		driver.findElement(By.id("renew_policy_submit")).click();
	}

}
