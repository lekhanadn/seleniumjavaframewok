package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isenabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/register/");
		driver.findElement(By.name("agreeTerms")).click();
		 WebElement button=driver.findElement(By.id("submitButton"));
		 
		 if(button.isEnabled())
		 {
			 System.out.println("button is enabled");
		 }
		 else
		 {
			 System.out.println("button is disabled");
		 }
		
}
}
