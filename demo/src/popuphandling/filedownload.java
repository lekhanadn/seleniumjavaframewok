package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class filedownload {
	public static void main(String[] args) throws Exception 
	{
		FirefoxProfile profile=new FirefoxProfile();
		
		String key="browser.helperApps.neverAsk.saveToDisk";
		String value="application/zip";
		
		profile.setPreference(key, value);
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//*[@id='mainContent']/p[7]/a[1]")).click();

		Thread.sleep(5000);
		
		
		
		
		

	}

}
