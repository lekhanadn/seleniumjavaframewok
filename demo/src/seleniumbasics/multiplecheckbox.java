package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplecheckbox {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/VijayaKumar/Desktop/Multiplecheckbox.html");
		
		 List<WebElement> allchkbox=driver.findElements(By.xpath("//input"));
		 
		 int count =allchkbox.size();
		 
		 System.out.println(count);
		 
		 // select the checkboxes from  top to bottom
		 for(int i=0;i<count;i=i+2)
		 {
			 allchkbox.get(i).click();
		 }
		 
		 // Unselect the checkboxes from bottom to top
		/* 
		 for( int i=count-1;i>=0;i--)
		 {
			 allchkbox.get(i).click();
		 }
*/

	}

}
