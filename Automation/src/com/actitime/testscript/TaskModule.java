package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule 
{
	@Test 
	public void createTask()
	{
		Reporter.log("create task", true);
	}
	@Test 
	public void deleteTask()
	{
		Reporter.log("delete task", true);
	}
	
}
