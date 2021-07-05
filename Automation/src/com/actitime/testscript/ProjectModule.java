package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule 
{
	@Test
	public void createProject()
	{
		Reporter.log("create project", true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("delete project", true);
	}
	
}
