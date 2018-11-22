package TestNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	@BeforeSuite
	public void Setup()
	{
	System.out.println("set the systemproperties");
	}
	@BeforeTest
	public void launchBrowser()
	{
	System.out.println("launch browser");
	}
	@BeforeClass
	public void enterUrl()
	{
	System.out.println("enter url");
	}
	@BeforeMethod
	public void logintoapplication()
	{
	System.out.println("log in to application");
	}
	@Test
	public void testCase1()
	{
		System.out.println("test case1");
	}
	@AfterMethod
	public void logoutapplication()
	{
		System.out.println("logout to application");
	}

	@AfterClass
	public void generateReport()
	{
		System.out.println("generateReport");
	}
	@AfterTest
	public void closeBrowser()
	{
	
		System.out.println("close browser");
	}

	@AfterSuite
	public void deleteCokkies()
	{
		System.out.println("delete cookies");
	}
	
	


}
