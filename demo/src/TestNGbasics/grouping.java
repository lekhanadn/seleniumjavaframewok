package TestNGbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grouping {
	WebDriver driver;
	@BeforeMethod(groups= {"test","title"})
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test(groups="test")
	public void testCase1()
	{
		System.out.println("test case1");
	}
	@Test(groups="test")
	public void testCase2() {
	
		System.out.println("test case2");
	}
	@Test(groups="title")
	public void testcase3()
	{
		System.out.println("test caese 3");
	}
	@Test(groups="title")
	public void getTiltle()
	{
		System.out.println(driver.getTitle());
	}
	@Test(groups="url")
	public void getUrl()
	{
		System.out.println(driver.getCurrentUrl());
	}
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}
}
