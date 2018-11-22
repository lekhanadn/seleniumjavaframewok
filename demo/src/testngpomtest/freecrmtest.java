package testngpomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testngpom.freecrmpage;

public class freecrmtest {
	WebDriver driver;
	@Test
	public void loginFunction()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

	 driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		
		freecrmpage fm=new freecrmpage(driver);
		
		
		fm.typeUsername("Ravi12345");
		fm.typePassWord("Ravi@12345");

		fm.clikonButton();
		driver.quit();
	}
}
