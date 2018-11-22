package testngpomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testngpom.loginpage;

public class logintest {
	

		@Test
		public void loginTest()
		{
			System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.freecrm.com/index.html");
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			loginpage lg=new loginpage( driver);
			lg.typeUsername("Ravi12345");
			lg.typePassword("Ravi@12345");
			lg.loginButton();
			driver.close();
			
		}
		
}
