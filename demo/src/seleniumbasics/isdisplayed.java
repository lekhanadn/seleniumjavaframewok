package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/register/");
		 WebElement image=driver.findElement(By.className("img-responsive"));
		 if(image.isDisplayed())
		 {
			 System.out.println(" image is dispalyed on the webpage");
		 }
		 else
		 {
			 System.out.println("image is not present on the page");
		 }
		
		
	}

}
