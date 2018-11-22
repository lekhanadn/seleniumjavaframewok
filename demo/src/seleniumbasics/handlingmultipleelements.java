package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingmultipleelements {
	

		public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");

		 List<WebElement > alllinks=driver.findElements(By.tagName("a"));
		 
		        int count= alllinks.size();
		        System.out.println("Number of links present in the page:"+ count);
		               
		        
		        for(int i=0;i<count;i++)
		        {
		        
		        	String  s= alllinks.get(i).getText();
		        	System.out.println(s);
		        }
			
		}



}
