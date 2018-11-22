package popuphandling;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowchildpopup {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		 Set<String> allwh=driver.getWindowHandles();
		 int count=allwh.size();
		 System.out.println(count);
		 for(String wh: allwh)
		 {
			 
			 driver.switchTo().window(wh);
			 String title=driver.getTitle();
			 System.out.println(title);
			 driver.close();
		 }
		// driver.close();
		// driver.quit();
		 

	}
}
