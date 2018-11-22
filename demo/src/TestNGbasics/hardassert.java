package TestNGbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hardassert {
	/*@Test
	public void testCase1()
	{
	
		Assert.assertEquals(12, 15);
	}

	@Test
	public void testCase2()
	{
	
		System.out.println("test caes2 started");
		Assert.assertEquals(12, 15,"numbers are not macthed");
		System.out.println("test caes2 ended");
	}
	@Test
	public void testCase3()
	{
		System.out.println("test caes3 started");
		Assert.assertEquals(12, 12,"numbers are not macthed");
	``	System.out.println("test caes3 ended");*/
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();	
	driver.get("https://www.google.co.in/");
	}
	@Test
	public void getTitle()
	{
		 String act=driver.getTitle();
		 System.out.println(act);
		 Assert.assertEquals(act,"google");
		 System.out.println("title is matched");
		 System.out.println("step2");
		 
		 
	}
	@Test
	public void getTitle1()
	{
		 String exptitle=driver.getTitle();
		 System.out.println(exptitle);
		 Assert.assertEquals(exptitle,"Google");
		 System.out.println("title is matched");
		 
		 
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
}
