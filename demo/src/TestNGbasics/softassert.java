package TestNGbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	WebDriver driver;
	@Test
	public void testCase()
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		driver=new FirefoxDriver();
		SoftAssert s=new SoftAssert();
		System.out.println("step1");
		s.assertEquals(12, 13);
		driver.get("https://www.google.co.in");
		 
		System.out.println("step2");
		System.out.println("step3");
		//s.assertAll();
		System.out.println("step4");
		s.assertAll();
}
}