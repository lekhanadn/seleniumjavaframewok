package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");

	  WebDriver  driver= new FirefoxDriver();
	  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.findElement(By.id("lst-ib")).sendKeys("selenium step by step");
	    driver.findElement(By.name("btnK")).click();
	   // driver.findElement(By.name("abcd")).click();
	    
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
	    driver.close();
	}

}
