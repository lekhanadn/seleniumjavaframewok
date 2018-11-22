package TestNGbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver driver;
	@Test
	@Parameters({"url","browser",})
	public void crmTest(String url,String browser)
	{
	if(browser.equalsIgnoreCase("Firefox"))
                 {
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		driver =new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse workspace\\demo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ie"))
  	{
		System.setProperty("webdriver.ie.driver", "E:\\eclipse workspace\\demo\\driver\\IEDriverServer.exe");

		driver =new InternetExplorerDriver();
	}
                   
		driver.get(url);
		//driver.findElement(By.name("identifier")).sendKeys("lekhanangowda");
		//driver.findElement(By.className("/RveJvd snByac")).click();
		//driver.findElement(By.name("password")).sendKeys("sriramjairam");
		//driver.findElement(By.className("RveJvd snByac")).click();
		driver.close();
	}
	
	


}
