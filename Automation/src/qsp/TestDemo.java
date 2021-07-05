package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo 
{
	@Test(priority=1,invocationCount = 3)
	public void createCustomer()
	{
		Reporter.log("createcustomer",true);
	}
	@Test(priority=2, dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("modifycustomer",true);
	}
	@Test(priority=3, dependsOnMethods = "createCustomer")
	public void deleteCustomer()
	{
		Reporter.log("deletecustomer",true);
	}
}
