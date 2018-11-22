package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BASICS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");

		  WebDriver  driver= new FirefoxDriver();
		  
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.google.com/");
		    System.out.println(driver.getTitle());
		    System.out.println(driver.getCurrentUrl());
		   // System.out.println(driver.getPageSource());
		    
	}

}
