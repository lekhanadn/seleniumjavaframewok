package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendivision {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Bangalore");
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Hyderabad");
		
		 driver.findElement(By.id("BE_flight_origin_date")).click();
		
		driver.findElement(By.id("18/09/2018")).click();
		

	
	
	    // public static  dateSelect(Webdriver driver,WebElement ele,String )
	}
}
