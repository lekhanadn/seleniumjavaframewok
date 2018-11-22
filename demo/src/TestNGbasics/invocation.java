package TestNGbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocation {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test(priority=1, invocationCount=2)
	public void getUrl()
	{
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test(priority=3)
	public void getTitle(){
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2)
	public void clickonGmail(){
	driver.findElement(By.linkText("Gmail")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
	driver.close();	
	}
}
