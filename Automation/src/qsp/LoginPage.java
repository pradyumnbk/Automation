package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement login;
	public LoginPage(WebDriver driver)
	{
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		login=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	/*public void setUsername(String un)
	{
		untbx.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwtbx.sendKeys(pw);
	}
	public void setLogin()
	{
		login.click();
	}*/
	public void setValue(String un, String pw)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		login.click();
	}
}
