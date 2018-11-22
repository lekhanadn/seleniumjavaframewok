package TestNGbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationcount {
	WebDriver driver;	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test(priority=1)
	public void test1(){
		System.out.println("test 1method");
	}

	@Test(priority=3)
	public void test2(){
		System.out.println("test2 method");
	}

	@Test(priority=2)
	public void test3(){
		System.out.println("test 3method");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
