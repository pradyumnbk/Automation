package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule
{
	@Test
	public void createCustomer()
	{
		Reporter.log("create customer", true);
		Assert.fail();
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("delete customer", true);
		Assert.fail();
	}
	
}
