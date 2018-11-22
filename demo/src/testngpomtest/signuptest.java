package testngpomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testngpom.signup;

public class signuptest {
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.freecrm.com/register/");
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		signup s=new signup(driver);
		
	s.typefname("hello");
	s.typeLastname("hi");
	s.typeemail("abc@gmail.com");
	s.typepassword("adc@1234");
	s.typeuser("ravi");
	s.typeconmail("abc@gmail.com");
	s.selectchk();
	s.submibtn();
}
}