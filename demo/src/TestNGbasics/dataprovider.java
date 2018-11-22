package TestNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	@DataProvider(name="Test")
	public Object[][] getData()
	{
		Object [][]data=new Object[3][2];
		
		data[0][0]="user1";
		data[0][1]="pass1";
		
		data[1][0]="user2";
		data[1][1]="pass2";
		
		data[2][0]="user3";
		data[2][1]="pass3";
		
		
		
		return data;
		
	}
	
	
	@Test(dataProvider="Test")
	public void testFacebook(String uname,String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("loginbutton")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
