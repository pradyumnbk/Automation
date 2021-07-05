package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public void setUsername(String un)
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
	}
	
}
