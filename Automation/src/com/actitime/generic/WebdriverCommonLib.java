package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib 
{
	/**
	 * generic method for implicit wait in GUI
	 * @param driver
	 */
	public void waitForElementInGui(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * generic method for explicit wait for element
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	/**
	 * generic method for custom wait for enabled element
	 * @param element
	 */
	public void customWaitForEnabledElement(WebElement element)
	{
		int i=1;
		 while (i<=100)
		 {
			 try
			 {
				 element.isEnabled();
			 }
			 catch (Exception e)
			 {
				 i++;
			 }
		 }
	}
	/**
	 * generic method to select the option from listbox using select by index
	 * @param element
	 * @param index
	 */
	public void selectOption(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * generic method to select the option from listbox using select by visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
}
